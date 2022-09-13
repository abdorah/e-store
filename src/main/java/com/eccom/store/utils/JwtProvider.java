package com.eccom.store.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.eccom.store.security.MyUserprincipals;
import com.eccom.store.security.SecurityConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.eccom.store.security.SecurityConstants.*;
import static java.util.Arrays.stream;

@Component
public class JwtProvider {
    private static final String SECRET_KEY = "secret_key_for_this_app";
    public String generateJwtToken(MyUserprincipals myUserprincipals){
        String claims[]=getClaimsFromUser(myUserprincipals);
        return JWT.create().withIssuer(SecurityConstants.GET_ARRAYS_LLC).withAudience(SecurityConstants.GET_ARRAYS_ADMINISTRATION)
                .withIssuedAt(new Date()).withSubject(myUserprincipals.getUsername())
                .withArrayClaim(AUTHORITIES,claims).withExpiresAt(new Date(System.currentTimeMillis()+3600_000))
                .sign(Algorithm.HMAC512(SECRET_KEY.getBytes()));
    }
public List<GrantedAuthority>getAuthorities(String token){
    String claims[] =getClaimsFromToken(token);
    return stream(claims).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
}

    private String[] getClaimsFromToken(String token) {
        JWTVerifier verifier=getJwtVerifier();
        return verifier.verify(token).getClaim(AUTHORITIES).asArray(String.class);
    }

    public String getSubject(String token){
        JWTVerifier verifier=getJwtVerifier();
        return verifier.verify(token).getSubject();

    }

    private JWTVerifier getJwtVerifier() {
        JWTVerifier verifier;
        try{
            Algorithm algorithm=Algorithm.HMAC512(SECRET_KEY);
            verifier= JWT.require(algorithm).withIssuer(GET_ARRAYS_LLC).build();
        }catch (JWTVerificationException exception){
    throw new JWTVerificationException(TOKEN_CANNOT_BE_VERIFIED);
        }
        return verifier;
    }

public Authentication getAuthentication(String username, List<GrantedAuthority>authorities, HttpServletRequest request){
    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
            new UsernamePasswordAuthenticationToken(username,authorities);
    return usernamePasswordAuthenticationToken;
}
    private String[] getClaimsFromUser(MyUserprincipals myUserprincipals) {
        List<String> authorities=new ArrayList<>();
        for(GrantedAuthority grantedAuthority: myUserprincipals.getAuthorities()){
            authorities.add(grantedAuthority.getAuthority());
        }
        return authorities.toArray(new String[0]);
    }

    public boolean IsTokenValid(String username,String token){
        JWTVerifier verifier= getJwtVerifier();
        return StringUtils.isNotEmpty(username)&& !IstokenExpired(verifier,token);

    }

    private boolean IstokenExpired(JWTVerifier verifier, String token) {
        Date expiration=verifier.verify(token).getExpiresAt();
        return expiration.before(new Date());
    }


}
