package com.example.FSD_13_09_2019_Employee_Inheritance.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.FSD_13_09_2019_Employee_Inheritance.entity.ContractualEmployee;
import com.example.FSD_13_09_2019_Employee_Inheritance.entity.Employee;
import com.example.FSD_13_09_2019_Employee_Inheritance.entity.RegularEmployee;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.ContractualEmployeeRepository;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.EmployeeRepository;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.RegularEmployeeRepository;
@Component
public class Populate implements ApplicationListener<ContextRefreshedEvent> {
    
	private EmployeeRepository employeeRepository;
	private RegularEmployeeRepository regularEmployeeRepository;
	private ContractualEmployeeRepository contractualEmployeeRepository;

	
	@Autowired
	public Populate(EmployeeRepository employeeRepository, RegularEmployeeRepository regularEmployeeRepository,
			ContractualEmployeeRepository contractualEmployeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.regularEmployeeRepository = regularEmployeeRepository;
		this.contractualEmployeeRepository = contractualEmployeeRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
		
	}
	public void init()
	{
		Employee empObj = new Employee("Vivek", "Shukla");
		
		RegularEmployee regEmpObj = new RegularEmployee(20000, 2456,new Employee("Becky", "becky@gg.com"));
		
		ContractualEmployee contEmpObj = new ContractualEmployee(23, 456, new Employee("Jose", "jose@gmail.com"));
		
		employeeRepository.save(empObj);
	    regularEmployeeRepository.save(regEmpObj);
	    contractualEmployeeRepository.save(contEmpObj);
		
		
	}

}
