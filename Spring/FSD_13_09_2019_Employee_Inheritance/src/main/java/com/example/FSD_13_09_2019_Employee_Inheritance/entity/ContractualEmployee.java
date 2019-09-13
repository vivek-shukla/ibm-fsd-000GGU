package com.example.FSD_13_09_2019_Employee_Inheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractual")
public class ContractualEmployee extends Employee {
	
	private int hr_paid;
	private int contract_period;
	
	public ContractualEmployee(int hr_paid, int contract_period, Employee emp) {
		super(emp.getName(),emp.getEmail());
		this.hr_paid = hr_paid;
		this.contract_period = contract_period;
	}

	public ContractualEmployee() {
		super();
	}
	
	

	public ContractualEmployee(Employee emp) {
		super(emp.getName(),emp.getEmail());
	}

	public int getHr_paid() {
		return hr_paid;
	}

	public void setHr_paid(int hr_paid) {
		this.hr_paid = hr_paid;
	}

	public int getContract_period() {
		return contract_period;
	}

	public void setContract_period(int contract_period) {
		this.contract_period = contract_period;
	}

	
	
	

}
