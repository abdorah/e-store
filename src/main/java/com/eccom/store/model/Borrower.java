package com.eccom.store.model;

import java.util.Set;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Borrower {
    
    @Id
    private Long borrowerId;

    private String firstName, lastName, userName, email, password;

    private Set<Item> itemsBorrowed, itemsReturned;

    public Long getBorrowerId() {
        return borrowerId;
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

    public Set<Item> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(Set<Item> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    public Set<Item> getItemsReturned() {
        return itemsReturned;
    }

    public void setItemsReturned(Set<Item> itemsReturned) {
        this.itemsReturned = itemsReturned;
    }
    
}
