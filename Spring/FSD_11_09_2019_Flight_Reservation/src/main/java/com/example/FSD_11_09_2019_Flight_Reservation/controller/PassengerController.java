package com.example.FSD_11_09_2019_Flight_Reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Flight;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Passenger;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Reservation;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.FlightRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.PassengerRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.ReservationRepository;

@Controller
@RequestMapping("/passenger")
public class PassengerController {

	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;
	private ReservationRepository reservationRepository;
	@Autowired
	public PassengerController(FlightRepository flightRepository, PassengerRepository passengerRepository,
			ReservationRepository reservationRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
		this.reservationRepository = reservationRepository;
	}
	
	@GetMapping("/passengerForm")
	public String redirectToPassengerForm(Model theModel)
	{
		Passenger passenger = new Passenger();
		theModel.addAttribute("passenger", passenger);
		theModel.addAttribute("flights",flightRepository.findAll());
		return "passenger/pForm";
		
	}
	
	@PostMapping("/save")
	public String savePassenger(@ModelAttribute("passenger") Passenger passengerObj)
	{
		passengerRepository.save(passengerObj);
		for(Flight flight:passengerObj.getFlights())
		{
			Reservation reservationObj = new Reservation();
			reservationObj.setPassenger(passengerObj);
			reservationObj.setFlight(flight);
			reservationRepository.save(reservationObj);
		}
		return "redirect:/flights/list";
	}
	
	
}
