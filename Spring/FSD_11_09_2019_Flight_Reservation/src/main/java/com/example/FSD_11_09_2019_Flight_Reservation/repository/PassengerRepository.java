package com.example.FSD_11_09_2019_Flight_Reservation.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Passenger;
@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	

}
