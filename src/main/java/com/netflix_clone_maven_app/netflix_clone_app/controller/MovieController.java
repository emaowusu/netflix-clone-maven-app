package com.netflix_clone_maven_app.netflix_clone_app.controller;


import com.netflix_clone_maven_app.netflix_clone_app.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
//public class MovieController {
//
//        @Autowired
//        private MovieRepository movieRepository;
//
//        @GetMapping("/movies")
//        public List<Movie> getMovies() {
//            return movieRepository.findAll();
//        }
//
//
//}


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public String moviesPage(Model model) {

        var movies = movieService.getAllMovies();

        String source = movieService.getLastSource();

        model.addAttribute("movies", movies);
        model.addAttribute("source", source);

        movieService.clearSource();

        return "movies";
    }
}