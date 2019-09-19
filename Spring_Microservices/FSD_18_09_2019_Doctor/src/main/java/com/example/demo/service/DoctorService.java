package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;

import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService { 
	@Autowired
	private DoctorRepository doctorRepository;
	
	public List<Doctor> getAllBySpeciality(String speciality)
	{
		return doctorRepository.findAllBySpeciality(speciality);
	}
	
	public Doctor insertPatient(Doctor doctorObj)
	{
		doctorRepository.save(doctorObj);
		return doctorObj;
	} 
	
	public List<Doctor> findAllByCriteria(String criteria)
	{
		return doctorRepository.findAllByFirstNameOrLastNameOrSpecialityContaining(criteria, criteria, criteria);
	}

}
