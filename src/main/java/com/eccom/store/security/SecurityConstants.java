package com.eccom.store.security;

public class SecurityConstants {

    public static final long EXPIRATION_TIME=4320_000;
    public static final String TOKEN_PREFIX="Bearer";
    public static final String JWT_TOKEN_HEADER="";
    public static final String TOKEN_CANNOT_BE_VERIFIED="token cannot be veried";
    public static final String GET_ARRAYS_LLC="Get arrays,llc";
    public static final String GET_ARRAYS_ADMINISTRATION="User management portal";
    public static final String AUTHORITIES="Authorities";
    public static final String FORBIDEN_MESSAGE="YOU need to login to acces this page";
    public static final String ACCES_DENIED_MESSAGE="You do not have permition to acces this page";
    public static final String OPTIONS_HTTP_METHODES="OPTION";
    public static final String [] PUBLIC_URLS={"/login","/register","/ressetpassword/**","/image/**"};
}
