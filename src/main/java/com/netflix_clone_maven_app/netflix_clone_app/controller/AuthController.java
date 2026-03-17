package com.netflix_clone_maven_app.netflix_clone_app.controller;

import com.netflix_clone_maven_app.netflix_clone_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;
//
//    @PostMapping("/register")
//    public String register(
//            @RequestParam String username,
//            @RequestParam String password){
//
//        userService.registerUser(username,password);
//
//        return "redirect:/login";
//    }
//
//    @PostMapping("/login")
//    public String login(
//            @RequestParam String username,
//            @RequestParam String password){
//
//        boolean valid=userService.loginUser(username,password);
//
//        if(valid){
//            return "redirect:/";
//        }
//
//        return "login";
//    }

    @PostMapping("/register")
    public String register(
            @RequestParam String username,
            @RequestParam String password){

        userService.registerUser(username,password);

        return "redirect:/login";
    }

}