package com.example.demo.controller;

import com.example.demo.bean.UserDTORequest;
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


    @GetMapping("/get/user/by/name/{name}")
    public List<User> getUserByName (@PathVariable String name){
        return userService.getUsersByName(name);
    }
    //    User findByNameOrName(String name1, String name2);
    @PostMapping("/get/user/by/names")
    public List<User> getUserByNames(@RequestBody UserDTORequest request){
        return userService.getUsersByNames(request);
    }

    @PostMapping("/get/user/by/id/name")
    public User getUserByNameAndId (@RequestBody UserDTORequest request){
        return userService.getUserByNameAndId(request).orElse(new User());
    }

    @PostMapping("/get/user/by/list/id")
    public List<User> getUsersByIdList(@RequestBody UserDTORequest request){
        return userService.getUsersByIds(request);
    }


}
