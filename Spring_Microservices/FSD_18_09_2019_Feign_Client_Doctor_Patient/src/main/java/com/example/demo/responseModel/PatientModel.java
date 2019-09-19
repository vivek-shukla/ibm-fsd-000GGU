package com.example.demo.responseModel;

public class PatientModel { 
	private String firstName;
	private String lastName;
	private String disease;
	public PatientModel(String firstName, String lastName, String disease) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.disease = disease;
	}
	public PatientModel() {
		super();
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	

}
