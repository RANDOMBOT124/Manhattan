package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Review;
import com.app.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	public Review addReview(Review review) {
		
		return reviewRepository.save(review);
	}
	


}
