package com.netflix_clone_maven_app.netflix_clone_app.service;

import com.netflix_clone_maven_app.netflix_clone_app.model.User;
import com.netflix_clone_maven_app.netflix_clone_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String username,String password){

        String hashedPassword = passwordEncoder.encode(password);

        User user = new User(username, hashedPassword);

        userRepository.save(user);
    }


    public boolean loginUser(String username,String password){

        return userRepository.findByUsername(username)
                .map(u -> u.getPassword().equals(password))
                .orElse(false);
    }
}

