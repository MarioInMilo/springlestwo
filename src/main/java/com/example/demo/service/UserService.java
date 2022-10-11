package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();


    User getUserById(Integer id);

    String deleteById(Integer id);

    List<User> updateUser(User user);
}
