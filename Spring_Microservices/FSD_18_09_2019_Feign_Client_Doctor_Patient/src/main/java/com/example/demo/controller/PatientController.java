package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.microservices.DoctorService;
import com.example.demo.microservices.PatientService;
import com.example.demo.responseModel.DoctorModel;
import com.example.demo.responseModel.PatientModel;

@Controller
public class PatientController
{  
	@Autowired
	private PatientService patientService;
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/patient/{disease}")
	public String getAllPatientByDisease(@PathVariable("disease") String disease,Model theModel)
	{   
		List<PatientModel> listPatient = patientService.getAllPatientByDisease(disease);
		
		theModel.addAttribute("patientList", listPatient);
		
		
		return "patientList";
	} 
	
	@GetMapping("/showPatientForm")
	public String redirectToPatientForm(Model theModel)
	{  
		theModel.addAttribute("patient", new PatientModel());
		return "patientForm";
	}
	
	@PostMapping("/patientSave")
	public String playerSave(@ModelAttribute("player") PatientModel theModel,Model model,HttpServletRequest request)
	{
//		patientService.insertPatient(theModel); 
		List<DoctorModel> listDoctor = doctorService.getAllDoctorBySpeciality(theModel.getDisease());
		model.addAttribute("doctorList", listDoctor);
		request.getSession().setAttribute("patient", theModel );
		return "doctorByDisease";
	}
	
}
