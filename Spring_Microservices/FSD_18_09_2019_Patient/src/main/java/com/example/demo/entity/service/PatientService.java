package com.example.demo.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.entity.dao.PatientRepository;

@Service
public class PatientService {
	@Autowired
    private PatientRepository patientRepository;
	
	public List<Patient> getAllByDisease(String disease)
	{
		return patientRepository.findAllByDisease(disease);
	}
	
	public Patient insertPatient(Patient patientObj)
	{
		patientRepository.save(patientObj);
		return patientObj;
	}
}
