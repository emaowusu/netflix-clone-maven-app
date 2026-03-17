package com.netflix_clone_maven_app.netflix_clone_app.controller;

import com.netflix_clone_maven_app.netflix_clone_app.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private MovieService movieService;


//    @GetMapping("/")
//    public String home(){
//        return "index";
//    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }


    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("movies", movieService.getAllMovies());

        return "index";
    }
}




