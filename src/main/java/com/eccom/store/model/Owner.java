package com.eccom.store.model;

import java.util.Set;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Owner {
    
    @Id
    private Long ownerId;

    private String firstName, lastName, userName, email, password;

    private Set<Item> itemsToPost, itemsAvailable, itemsReturned; 

    public Long getOwnerId() {
        return ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Item> getItemsToPost() {
        return itemsToPost;
    }

    public void setItemsToPost(Set<Item> itemsToPost) {
        this.itemsToPost = itemsToPost;
    }

    public Set<Item> getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(Set<Item> itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    public Set<Item> getItemsReturned() {
        return itemsReturned;
    }

    public void setItemsReturned(Set<Item> itemsReturned) {
        this.itemsReturned = itemsReturned;
    }

}
