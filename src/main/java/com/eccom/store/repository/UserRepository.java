package com.eccom.store.repository;


import com.eccom.store.model.Role;
import com.eccom.store.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
