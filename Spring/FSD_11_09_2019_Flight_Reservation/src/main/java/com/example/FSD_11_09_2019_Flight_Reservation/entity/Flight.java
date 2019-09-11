package com.example.FSD_11_09_2019_Flight_Reservation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Flight { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String airlines;
	@ManyToMany
	@JoinTable(name = "flight_passenger",joinColumns = @JoinColumn(name = "flight_id"),inverseJoinColumns = @JoinColumn(name="passenger_id"))
	private List<Passenger> passengers = new ArrayList<Passenger>();
	public Flight(String name, String airlines) {
		super();
		this.name = name;
		this.airlines = airlines;
	}
	
	public Flight() {
		super();
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
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	
	


}
