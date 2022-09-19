package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Movie;
import com.app.model.Review;
import com.app.service.MovieService;
import com.app.service.ReviewService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	ReviewService reviewService;
	
	
	
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		
		return movieService.addMovie(movie);
	}
	
    
	@PutMapping("/movies/{id}")
	public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {
			
		return movieService.updateMovie(id, movie);
			
		}
	
	@DeleteMapping("/movies/{id}")
	public String deleteMovie(@PathVariable int id) {
		
		movieService.deleteMovie(id);
		return "Record deleted";
		
	}
	
	@GetMapping("/movies/name/{name}")
	public Movie getByName(@PathVariable String name) {
		
		return movieService.getByName(name);
	}
	
	@GetMapping("/movies/genre/{genre}")
	public Movie getByGenre(@PathVariable String genre) {
		
		return movieService.getByGenre(genre);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movies/reviews/{name}")
	public List<Review> getAllReviewsByMovieName(@PathVariable String name){
		
		return movieService.getReviewsByName(name);
	}
	
	
	}
