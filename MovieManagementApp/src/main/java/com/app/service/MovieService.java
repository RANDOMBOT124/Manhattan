
package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Movie;
import com.app.model.Review;
import com.app.repository.MovieRepository;
import com.app.repository.ReviewRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
    ReviewRepository reviewRepository;
	
	public Movie addMovie(Movie movie) {
		
		return movieRepository.save(movie);
	}
	
	
	public Movie updateMovie(int id, Movie movie) {
		
		Movie m = movieRepository.findById(id).get();
		m.setName(movie.getName());
		m.setGenre(movie.getGenre());
		m.setYearOfRelease(movie.getYearOfRelease());
		movieRepository.save(m);
		return m;
		
	}
	
	public void deleteMovie(int id) {
	   
		Movie m = movieRepository.findById(id).get();
		List<Review> list = reviewRepository.findByMovie(m);
		for(Review r : list)
			reviewRepository.delete(r);
		movieRepository.delete(m);
		
	}
	
	public List<Movie> getAllMovies(){
		
		return movieRepository.findAll();
	}
	
	public Movie getByName(String name) {
		
		return movieRepository.findByName(name);
	}
	
	public List<Movie> getByGenre(String genre) {
			
			return movieRepository.findByGenre(genre);
		}
		


}
