package com.eccom.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccom.store.model.Borrower;
import org.springframework.data.repository.CrudRepository;

public interface BorrowersRepository extends CrudRepository<Borrower, Long> {
    
    
}
