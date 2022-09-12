package com.eccom.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccom.store.model.Item;

public interface ItemsRepository extends JpaRepository<Item, Long> {
    
}
