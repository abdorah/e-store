package com.eccom.store.repository;

import com.eccom.store.model.Owner;
import com.eccom.store.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
