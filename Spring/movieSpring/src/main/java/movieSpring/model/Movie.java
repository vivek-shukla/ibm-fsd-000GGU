package movieSpring.model;

import java.util.ArrayList;
import java.util.List;

public class Movie { 
	
	private String name,genre,director; 
	public String getName() {
		return name;
	}
   
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Movie() {
		super();
	}

	public Movie(String name, String genre, String director) {
		super();
		this.name = name;
		this.genre = genre;
		this.director = director;
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", director=" + director + "]";
	}

}


