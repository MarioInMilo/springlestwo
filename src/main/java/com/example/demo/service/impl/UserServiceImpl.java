package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public String deleteById(Integer id) {
        String info = null;
        try {
            repository.deleteById(id);
            info = "true";
        } catch (Exception e) {
            info = "error";
        }
        return info;
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> updateUser(User user) {
        if (user.getId() != null) {
            saveUser(user);
        }
        return getAllUsers();
    }


}
