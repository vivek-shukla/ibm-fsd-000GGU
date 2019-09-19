package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.microservices.DoctorService;
import com.example.demo.microservices.PatientService;
import com.example.demo.responseModel.DoctorModel;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/doctors/findBy")
	public String getAllPatientByDisease(@RequestParam("criteria") String criteria,Model theModel)
	{   
		List<DoctorModel> listDoctor = doctorService.findAllByCriteria(criteria);
		
		theModel.addAttribute("doctorList", listDoctor);
		return "doctorByDisease";
	} 
	
}
