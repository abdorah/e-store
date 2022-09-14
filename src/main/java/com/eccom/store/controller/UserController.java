package com.eccom.store.controller;

import com.eccom.store.model.Role;
import com.eccom.store.model.User;
import com.eccom.store.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private UserService userService;

//    @GetMapping("/users")
//    public ResponseEntity<List<User>>getUsers(){
//        return ResponseEntity.ok().body(userService.getUsers());
//    }
//
//    @PostMapping("/user/save")
//    public ResponseEntity<User>saveUser(@RequestBody User user){
//        URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.saveUser(user));
//    }
//    @PostMapping("/role/save")
//    public ResponseEntity<Role>saveRole(@RequestBody Role role){
//        URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.SaveRole(role));
//    }
//
//    @PostMapping("/role/addtouser")
//    public ResponseEntity<?>saveroletouser(@RequestBody RoleToUserForm form){
//        URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
//        userService.addRoletoUser(form.getUsername(), form.getRoleName());
//        return ResponseEntity.ok().build();
//    }
      @CrossOrigin
    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }

}

//@Data
// class RoleToUserForm {
//    private String username;
//    private String roleName;
//}