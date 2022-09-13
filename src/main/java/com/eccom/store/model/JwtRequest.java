package com.eccom.store.model;

public class JwtRequest {

    private User user;
    private  String jwtRequest;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJwtRequest() {
        return jwtRequest;
    }

    public void setJwtRequest(String jwtRequest) {
        this.jwtRequest = jwtRequest;
    }

    public JwtRequest(User user, String jwtRequest) {
        this.user = user;
        this.jwtRequest = jwtRequest;

    }
}
