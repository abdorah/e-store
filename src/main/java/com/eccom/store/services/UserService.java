package com.eccom.store.services;

import com.eccom.store.model.Role;
import com.eccom.store.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role SaveRole(Role role);

   void addRoletoUser(String username,String roleName);
   User getUsers(String username);
   List<User>getUsers();

}