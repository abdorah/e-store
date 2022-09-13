package com.eccom.store.repository;


import com.eccom.store.model.Role;
import com.eccom.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String Email);
}
