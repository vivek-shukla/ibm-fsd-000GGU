package com.example.FSD_11_09_2019_Flight_Reservation.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.FSD_11_09_2019_Flight_Reservation.entity.Flight;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Passenger;
import com.example.FSD_11_09_2019_Flight_Reservation.entity.Reservation;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.FlightRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.PassengerRepository;
import com.example.FSD_11_09_2019_Flight_Reservation.repository.ReservationRepository;
@Component
public class Populate implements ApplicationListener<ContextRefreshedEvent> {

    private PassengerRepository passengerRepository;
    private FlightRepository flightRepository;
    private ReservationRepository reservationRepository;
    
    
    @Autowired
	public Populate(PassengerRepository passengerRepository, FlightRepository flightRepository,
			ReservationRepository reservationRepository) {
		super();
		this.passengerRepository = passengerRepository;
		this.flightRepository = flightRepository;
		this.reservationRepository = reservationRepository;
	}



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
		
	}
	
	public void init()
	{
		Passenger vivek = new Passenger("vivek", "shhukla", "vivek@gmail.com");
		Passenger anuj = new Passenger("Anuj", "Singh", "Anuj@gmail.com");
		Flight flight = new Flight("scoot", "Noc");
		vivek.getFlights().add(flight);
		anuj.getFlights().add(flight);
		flight.getPassengers().add(vivek);
		flight.getPassengers().add(anuj);
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(anuj);
		Reservation resrvation2 = new Reservation();
		resrvation2.setFlight(flight);
		resrvation2.setPassenger(vivek);
		
		passengerRepository.save(vivek);
		passengerRepository.save(anuj);
		flightRepository.save(flight);
		reservationRepository.save(reservation);
		reservationRepository.save(resrvation2);
	}

}
