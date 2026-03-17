package com.netflix_clone_maven_app.netflix_clone_app.service;

import com.netflix_clone_maven_app.netflix_clone_app.model.Movie;
import com.netflix_clone_maven_app.netflix_clone_app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    private static final ThreadLocal<String> source = new ThreadLocal<>();

    @Cacheable("movies")
    public List<Movie> getAllMovies() {

        source.set("DATABASE");
        System.out.println("Fetching from DATABASE...");

        return movieRepository.findAll();
    }

    public String getLastSource() {
        return source.get() == null ? "REDIS" : source.get();
    }

    public void clearSource() {
        source.remove();
    }
}

