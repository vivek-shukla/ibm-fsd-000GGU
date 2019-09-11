package com.example.FSD_11_09_2019_Flight_Reservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
   @OneToOne
	private Passenger passenger;
   @OneToOne
	private Flight flight;
public Reservation() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
   
}
