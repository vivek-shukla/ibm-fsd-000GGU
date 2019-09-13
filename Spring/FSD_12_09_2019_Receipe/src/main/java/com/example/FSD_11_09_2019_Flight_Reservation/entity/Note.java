package com.example.FSD_11_09_2019_Flight_Reservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description;
	@OneToOne
	private Receipe receipe;
	
	public Note(String description) {
		super();
		this.description = description;
	}
	public Note() {
		super();
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
	public Receipe getReceipe() {
		return receipe;
	}
	public void setReceipe(Receipe receipe) {
		this.receipe = receipe;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", description=" + description + ", receipe=" + receipe + "]";
	}
	
	
	

}
