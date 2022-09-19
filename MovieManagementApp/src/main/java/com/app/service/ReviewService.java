package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Movie;
import com.app.model.Review;
import com.app.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	public Review addReview(Review review) {
		
		return reviewRepository.save(review);
	}
	
	public List<Review> getReviewsByMovie(Movie movie){
		
		return reviewRepository.findByMovie(movie);
	}

    public void deleteReview(int id) {
    	 Review r = reviewRepository.findById(id).get();
    	 reviewRepository.delete(r);
    }
}
