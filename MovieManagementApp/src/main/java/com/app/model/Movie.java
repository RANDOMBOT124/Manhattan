package com.app.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	
	@Id
	private int id;
	private String name;
	private String genre;
	private Date yearOfRelease;
	
	

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String name, String genre, Date yearOfRelease) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(Date yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(genre, id, name,yearOfRelease);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(genre, other.genre) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(yearOfRelease, other.yearOfRelease);
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", yearOfRelease=" + yearOfRelease
				+"]";
	}
	
	
	
	
	

}
