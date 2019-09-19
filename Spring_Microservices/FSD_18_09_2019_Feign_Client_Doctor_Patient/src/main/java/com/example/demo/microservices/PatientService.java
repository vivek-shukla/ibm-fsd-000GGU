package com.example.demo.microservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.responseModel.PatientModel;

@FeignClient("patient-service")
public interface PatientService {
    
	@GetMapping("/patient/{disease}")
	public List<PatientModel> getAllPatientByDisease(@PathVariable("disease") String disease);
	
	@PostMapping("/patient")
	public PatientModel insertPatient(@RequestBody PatientModel patientObj);
}
