package com.example.FSD_11_09_2019_Flight_Reservation.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	

}
