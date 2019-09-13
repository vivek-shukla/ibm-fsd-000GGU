package com.example.FSD_13_09_2019_Employee_Inheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regular")
public class RegularEmployee extends Employee {
	private int salary;
	private int commission;
	
	
	public RegularEmployee() {
		super();
	}


	public RegularEmployee(int salary, int commission,Employee emp) {
		super(emp.getName(),emp.getEmail());
		this.salary = salary;
		this.commission = commission;
	}
	
	


	public RegularEmployee(Employee empObj) {
		super(empObj.getName(),empObj.getEmail());
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getCommission() {
		return commission;
	}


	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	
	

}
