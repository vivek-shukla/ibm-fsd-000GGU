package com.example.FSD_13_09_2019_Employee_Inheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FSD_13_09_2019_Employee_Inheritance.entity.ContractualEmployee;
import com.example.FSD_13_09_2019_Employee_Inheritance.entity.Employee;
import com.example.FSD_13_09_2019_Employee_Inheritance.entity.RegularEmployee;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.ContractualEmployeeRepository;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.EmployeeRepository;
import com.example.FSD_13_09_2019_Employee_Inheritance.repository.RegularEmployeeRepository;

@Controller
@RequestMapping("/")
public class EmployeeController {
	private EmployeeRepository employeeRepository;
	private RegularEmployeeRepository regularEmployeeRepository;
	private ContractualEmployeeRepository contractualEmployeeRepository;
	
	
	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository,
			RegularEmployeeRepository regularEmployeeRepository,
			ContractualEmployeeRepository contractualEmployeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.regularEmployeeRepository = regularEmployeeRepository;
		this.contractualEmployeeRepository = contractualEmployeeRepository;
	}

	@GetMapping("/")
	public String redirectTo(Model theModel)
	{  
		theModel.addAttribute("employee", new Employee());
		return "home";
	}
	
	@PostMapping("/processForm")
	public String redirectToNextForm(@ModelAttribute("employee") Employee empObj, @RequestParam("eType") String e_type,Model theModel)
	{
		if(e_type.equals("Employee"))
		{
			employeeRepository.save(empObj);
		}
		else if(e_type.equals("Regular"))
		{   RegularEmployee regularEmpObj = new RegularEmployee(empObj);
		    theModel.addAttribute("regularEmployee", regularEmpObj);
			return "regularEmpForm";
		}
		else if(e_type.equals("Contractual"))
		{   ContractualEmployee contractualEmpObj = new ContractualEmployee(empObj);
		   theModel.addAttribute("contractualEmployee", contractualEmpObj);
			return "contractualEmpForm";
		}
		
		return "nextForm";
	}
	@PostMapping("/saveContractualEmp")
	public String saveContractualEmployee(@ModelAttribute("contractualEmployee") ContractualEmployee cEmpObj)
	{
		contractualEmployeeRepository.save(cEmpObj);
		return "redirect:/";
	}
	@PostMapping("/saveRegularEmp")
	public String saveRegularEmployee(@ModelAttribute("regularEmployee") RegularEmployee rEmpObj)
	{
		regularEmployeeRepository.save(rEmpObj);
		return "redirect:/";
	}
}
