package com.eccom.store.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Entity
public class User{

    @Id
    private Long Id;
    private String Name;
    private String LastName;
    private String username;
    private String Password;
    @ManyToMany(fetch =EAGER)
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

    public String getUsername() {
        return username;
    }

    public void setEmail(String username) {
        username = username;
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
    private Set<Role> role;
    public User(){}
    public User(Long id, String name, String lastName, String username, String password, String[] roles, String[] authorities) {
        Id = id;
        Name = name;
        LastName = lastName;
        username = username;
        Password = password;
        Roles = roles;
        Authorities = authorities;
    }
    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
    private String[] Authorities;
}
