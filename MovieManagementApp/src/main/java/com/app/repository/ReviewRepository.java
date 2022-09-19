package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Movie;
import com.app.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

	public List<Review> findByMovie(Movie movie);
}
