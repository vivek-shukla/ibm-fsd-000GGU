package com.fsd._09_2019_annotationAndXML.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("theDirector")
public class Director {
    @Value("2")
	int id;
    @Value("Alfonso Cuaron")
	String name;
    @Value("Dystopina Future")
	String genre;
    @Value("Childre of men")
	String favoriteMovie;
    
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
	public String getFavoriteMovie() {
		return favoriteMovie;
	}
	public void setFavoriteMovie(String favoriteMovie) {
		this.favoriteMovie = favoriteMovie;
	}
	
}
