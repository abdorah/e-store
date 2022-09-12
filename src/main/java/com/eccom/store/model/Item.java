package com.eccom.store.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Item {
    
    @Id
    private Long itemId;

    private String photoUrl, description, availabality;

    public Long getItemId() {
        return itemId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailabality() {
        return availabality;
    }

    public void setAvailabality(String availabality) {
        this.availabality = availabality;
    }
 
}
