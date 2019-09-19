package com.example.demo.microservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.responseModel.DoctorModel;
import com.example.demo.responseModel.PatientModel;

@FeignClient("doctor-service")
public interface DoctorService {
   
	@GetMapping("/doctors/{speciality}")
	public List<DoctorModel> getAllDoctorBySpeciality(@PathVariable("speciality") String speciality);
	
	@PostMapping("/doctor")
	public PatientModel insertPatient(@RequestBody DoctorModel doctorObj);
	
	@GetMapping("/doctors/findBy/{criteria}")
	public List<DoctorModel> findAllByCriteria(@PathVariable("criteria") String criteria);
	
}

