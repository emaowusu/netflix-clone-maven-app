package com.netflix_clone_maven_app.netflix_clone_app.repository;

import com.netflix_clone_maven_app.netflix_clone_app.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long> {

}


