package com.fsd.jdbc_spring.bean;

import org.springframework.stereotype.Component;


public class Movie {
  
	private int id;
	private String name;
	private String director;
	
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Movie( String name, String director) {
		super();
		this.name = name;
		this.director = director;
	}
	
	
}
