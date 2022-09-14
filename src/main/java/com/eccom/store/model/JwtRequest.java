package com.eccom.store.model;

public class JwtRequest {
    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
//    private User user;
//    private  String jwtRequest;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getJwtRequest() {
//        return jwtRequest;
//    }
//
//    public void setJwtRequest(String jwtRequest) {
//        this.jwtRequest = jwtRequest;
//    }
//
//    public JwtRequest(User user, String jwtRequest) {
//        this.user = user;
//        this.jwtRequest = jwtRequest;
//
//    }
}
