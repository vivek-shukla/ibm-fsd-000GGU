package com.example.FSD_11_09_2019_Flight_Reservation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private float amount;
 private String description;
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "receipe_id", nullable = false)
 private Receipe receipe;
 public Ingredient() {
	super();
}

public Ingredient(float amount, String description) {
	super();
	this.amount = amount;
	this.description = description;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Receipe getReceipe() {
	return receipe;
}
public void setReceipe(Receipe receipes) {
	this.receipe = receipes;
}
 
 
}
