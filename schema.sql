CREATE DATABASE netflixdb;

USE netflixdb;

INSERT INTO movie(title, description, image_url) VALUES
('Extraction','Action-packed movie','/images/movie1.jpg'),
('Space Force','Action-packed movie','/images/movie2.jpg'),
('The Passion of The Christ','Christian movie','/images/movie3.jpg'),
('Mr. Bones','Comedy movie','/images/movie4.jpg'),
('Old Guard 2','Sci-fi movie','/images/movie5.jpg');

SELECT * FROM movie;
