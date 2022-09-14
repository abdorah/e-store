package com.eccom.store.repository;

import com.eccom.store.model.Owner;
import com.eccom.store.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, String> {

}
