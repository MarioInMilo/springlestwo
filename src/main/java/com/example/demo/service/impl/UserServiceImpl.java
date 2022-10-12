package com.example.demo.service.impl;

import com.example.demo.bean.UserDTORequest;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<User> getUsersByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<User> getUsersByNames(UserDTORequest request) {
        return repository.findByNameOrName(request.getFirstName(), request.getSecondName());
    }

    @Override
    public Optional<User> getUserByNameAndId(UserDTORequest request) {
        return repository.findByNameAndId(request.getFirstName(), request.getId());
    }

    @Override
    public List<User> getUsersByIds(UserDTORequest request) {
        return repository.findByIdIn(request.getUsers());
    }


}
