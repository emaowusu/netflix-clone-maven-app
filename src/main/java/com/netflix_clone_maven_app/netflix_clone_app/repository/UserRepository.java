package com.netflix_clone_maven_app.netflix_clone_app.repository;


import com.netflix_clone_maven_app.netflix_clone_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}


