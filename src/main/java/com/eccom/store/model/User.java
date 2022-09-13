package com.eccom.store.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    private Long Id;
    private String Name;
    private String LastName;
    private String Email;
    private String Password;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String[] getRoles() {
        return Roles;
    }

    public void setRoles(String[] roles) {
        Roles = roles;
    }

    public String[] getAuthorities() {
        return Authorities;
    }

    public void setAuthorities(String[] authorities) {
        Authorities = authorities;
    }

    private String[] Roles;
    public User(){}
    public User(Long id, String name, String lastName, String email, String password, String[] roles, String[] authorities) {
        Id = id;
        Name = name;
        LastName = lastName;
        Email = email;
        Password = password;
        Roles = roles;
        Authorities = authorities;
    }

    private String[] Authorities;
}
