package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public List<User> allUsers(){
        return userRepository.findAll();
    }
    public void add(User user){
        userRepository.save(user);
    }
    public void delete(User user){
        userRepository.delete(user);
    }
    public void edit(User user){
        userRepository.saveAndFlush(user);
    }
    public User getById(int id){
        return userRepository.getById(id);
    }
}
