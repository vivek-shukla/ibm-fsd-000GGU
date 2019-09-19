package com.example.demo.responseModel;


public class DoctorModel {
	
  private String firstName;
  private String lastName;
  private String speciality;
  
public DoctorModel() {
	super();
}

public DoctorModel(String firstName, String lastName, String speciality) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.speciality = speciality;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSpeciality() {
	return speciality;
}

public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
  
  
}
