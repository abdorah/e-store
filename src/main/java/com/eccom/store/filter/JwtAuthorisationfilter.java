package com.eccom.store.filter;

import com.auth0.jwt.interfaces.JWTVerifier;
import com.eccom.store.security.SecurityConstants;
import com.eccom.store.utils.JwtProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.springframework.http.HttpStatus.OK;


public class JwtAuthorisationfilter extends OncePerRequestFilter {

    private JwtProvider jwtTokenProvider;

    public JwtAuthorisationfilter(JwtProvider jwtTokenProvider){
        this.jwtTokenProvider=jwtTokenProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(request.getMethod().equalsIgnoreCase(SecurityConstants.OPTIONS_HTTP_METHODES)){
            response.setStatus(OK.value());
        }else{
            String authorizationheader= request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authorizationheader==null||authorizationheader.startsWith(SecurityConstants.TOKEN_PREFIX)){
                    filterChain.doFilter(request,response);
                    return;
            }
        }
    }
}
