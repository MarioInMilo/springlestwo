package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("/get/all/users")
    public List<User> getAll(){
        return userService.getAllUsers();
    }


    @GetMapping("/get/by/id/{id}")
    public User searchById(@PathVariable Integer id){
        return userService.getUserById(id);
    }


    @DeleteMapping("/delete/user/by/id/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteById(id);
    }


    @PutMapping("update/user")
    public List<User> updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


}
