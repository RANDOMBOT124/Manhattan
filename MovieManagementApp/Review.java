package com.app.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	private int id;
	private String description;
	
	@ManyToOne
    Movie movie;
	
	public Review(int id, String description, Movie movie) {
		super();
		this.id = id;
		this.description = description;
		this.movie=movie;
	}


	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, id, movie);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(movie, other.movie);
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", movie=" + movie + "]";
	}


	
	

}
