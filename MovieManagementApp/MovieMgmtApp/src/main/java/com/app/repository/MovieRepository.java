package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	public Movie findByName(String name);
	
	public Movie findByGenre(String genre);

}
