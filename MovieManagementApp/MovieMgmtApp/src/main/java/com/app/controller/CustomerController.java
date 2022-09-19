package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Movie;
import com.app.model.Review;
import com.app.service.MovieService;
import com.app.service.ReviewService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	ReviewService reviewService;
	
	@GetMapping("/movies/name/{name}")
	public Movie getByName(@PathVariable String name) {
		
		return movieService.getByName(name);
	}
	
	@PostMapping("/reviews")
	public Review addReview(@RequestBody Review review) {
		
		return reviewService.addReview(review);
	}
	
	@GetMapping("/movies/reviews/{name}")
	public List<Review> getAllReviewsByMovieName(@PathVariable String name){
		
		return movieService.getReviewsByName(name);
	}
	
	

}
