package com.app.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	private int id;
	private String description;
	

	public Review(int id, String description) {
		super();
		this.id = id;
		this.description = description;
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


	@Override
	public int hashCode() {
		return Objects.hash(description, id);
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
		return Objects.equals(description, other.description) && id == other.id;
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + "]";
	}
	
	
	

}
