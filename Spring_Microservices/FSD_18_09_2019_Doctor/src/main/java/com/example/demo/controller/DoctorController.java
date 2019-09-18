package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/doctors/{speciality}")
	public ResponseEntity<List<Doctor>> getAllBySpeciality(@PathVariable("speciality") String speciality)
	{
		return ResponseEntity.ok(doctorService.getAllBySpeciality(speciality));
	}
	@PostMapping("/doctors")
	public ResponseEntity<Doctor> insertDoctor(@RequestBody Doctor doctor)
	{
		return ResponseEntity.ok(doctor);
	}

}
