package com.eccom.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccom.store.model.Borrower;

public interface BorrowersRepository extends JpaRepository<Borrower, Long> {
    
    
}
