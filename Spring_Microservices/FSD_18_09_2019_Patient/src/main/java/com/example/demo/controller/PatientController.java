package com.example.demo.controller;

import java.util.List;

import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.entity.service.PatientService;

@RestController
public class PatientController {
   @Autowired
   private PatientService patientService;
   
   @PostMapping("/patient")
   public ResponseEntity<Patient> insertPatient(@RequestBody Patient patient)
   {
	  return ResponseEntity.ok(patientService.insertPatient(patient)); 
   }
   
   @GetMapping("/patient/{disease}")
   public ResponseEntity<List<Patient>> fetchAllBYDisease(@PathVariable("disease") String disease)
   {
	   return ResponseEntity.ok(patientService.getAllByDisease(disease));
   }
}
