package com.example.FSD_11_09_2019_Flight_Reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Flight;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.FlightRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.PassengerRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.ReservationRepository;

@Controller
@RequestMapping("/flights")
public class FlightReservationController {
	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;
	private ReservationRepository reservationRepository;
	
	@Autowired
    public FlightReservationController(FlightRepository flightRepository, PassengerRepository passengerRepository,
			ReservationRepository reservationRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
		this.reservationRepository = reservationRepository;
	}


	@RequestMapping("/list")
	public String showAllFlight(Model theModel)
	{
		theModel.addAttribute("flights",flightRepository.findAll());
		return "flights";
		
	}
	
	@GetMapping("/showForm")
	public String showFlightForm(Model theModel)
	{
		Flight flight = new Flight();
		theModel.addAttribute("flight", flight);
		return "flightForm";
	}
	
	@PostMapping("/save")
	public String saveFlight(@ModelAttribute("flight") Flight theFlight)
	{
		flightRepository.save(theFlight);
		return "redirect:/flights/list";
	}
	
}
