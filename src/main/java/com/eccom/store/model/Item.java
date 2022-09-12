package com.eccom.store.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {
    
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
