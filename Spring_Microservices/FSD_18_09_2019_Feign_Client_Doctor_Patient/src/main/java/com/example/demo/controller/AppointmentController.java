package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.microservices.PatientService;
import com.example.demo.responseModel.PatientModel;

@Controller
public class AppointmentController {
	@Autowired
	private PatientService patientService;
	@GetMapping("/fixAppointment")
	public String appointmentReceipt(@RequestParam("doctor") String doctorName,HttpServletRequest request)
	{
		request.getSession().setAttribute("assignedDoctor", doctorName );
		return "confirmAppointment";
	}
	
	@GetMapping("/confirmAppointment")
	public String confirmAppointment(HttpServletRequest request)
	{
		patientService.insertPatient((PatientModel)request.getSession().getAttribute("patient"));
		return "ThankYou";
	}
}
