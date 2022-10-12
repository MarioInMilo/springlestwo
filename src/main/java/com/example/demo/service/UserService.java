package com.example.demo.service;

import com.example.demo.bean.UserDTORequest;
import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();


    User getUserById(Integer id);

    String deleteById(Integer id);

    List<User> updateUser(User user);

    List<User> getUsersByName(String name);

    List<User> getUsersByNames(UserDTORequest request);


    Optional<User> getUserByNameAndId(UserDTORequest request);

    List<User> getUsersByIds(UserDTORequest request);
}
