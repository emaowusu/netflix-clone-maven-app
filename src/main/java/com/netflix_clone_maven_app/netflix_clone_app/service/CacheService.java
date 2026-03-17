package com.netflix_clone_maven_app.netflix_clone_app.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("testCache")
    public String getData() {
        System.out.println("Fetching from method...");
        return "Redis Working";
    }
}

