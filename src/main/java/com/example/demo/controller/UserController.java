package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Userentity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping("/create")
    public Userentity createUser(@RequestBody Userentity user) {
        return userService.createUser(user);
    }

    // READ ALL
    @GetMapping("/all")
    public List<Userentity> getAllUsers() {
        return userService.getAllUsers();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Userentity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Userentity updateUser(@PathVariable Long id,
                                 @RequestBody Userentity user) {
        return userService.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
