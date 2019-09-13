package com.example.FSD_11_09_2019_Flight_Reservation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cook_time;
	private String description;
	private int serving;
	private String source_url;
	

	private String difficulty;
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "receipe")
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	public Receipe() { 
		super();
	   
	}
	
	public Receipe(int cook_time, String description, int serving, String source_url, String difficulty) {
		super();
		this.cook_time = cook_time;
		this.description = description;
		this.serving = serving;
		this.source_url = source_url;
		this.difficulty = difficulty;
	}
 
	

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCook_time() {
		return cook_time;
	}
	public void setCook_time(int cook_time) {
		this.cook_time = cook_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getServing() {
		return serving;
	}
	public void setServing(int serving) {
		this.serving = serving;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
}
