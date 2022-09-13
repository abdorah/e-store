package com.eccom.store.services;

import com.eccom.store.model.Role;
import com.eccom.store.model.User;
import com.eccom.store.repository.RoleRepository;
import com.eccom.store.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional @Slf4j
public class UserServiceimp implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceimp(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public User saveUser(User user) {
        log.info("saving new user to the database");
        return userRepository.save(user);
    }

    @Override
    public Role SaveRole(Role role) {
        log.info("saving new Role to the database");
        return roleRepository.save(role);
    }

    @Override
    public void addRoletoUser(String username, String roleName) {
        log.info("adding new user to the database");
        User user=userRepository.findByUsername(username);
        Role role=roleRepository.findByName(roleName);
    }

    @Override
    public User getUsers(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
