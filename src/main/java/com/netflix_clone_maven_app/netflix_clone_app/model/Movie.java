package com.netflix_clone_maven_app.netflix_clone_app.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Movie implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

//    private String imageUrl;
    @Column(name = "image_url")
    private String imageUrl;

    public Movie() {}

    public Movie(String title,String description,String imageUrl){
        this.title=title;
        this.description=description;
        this.imageUrl=imageUrl;
    }

    public Long getId(){ return id; }

    public String getTitle(){ return title; }

    public String getDescription(){ return description; }

    public String getImageUrl(){ return imageUrl; }

}