package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Customer;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
	private CustomerService customerService;
    
    @GetMapping("/customers")
    public List<Customer> fetchAllCustomer()
    {
    	return customerService.findAllCustomer();
    }
    
    @PostMapping("/customers")
    public String insertCustomer(@RequestBody Customer customerObj)
    {
    	customerObj.setId(0);
    	customerService.insertCustomer(customerObj);
    	return "Customer added";
    }
    
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable int id)
    {
    	
    	customerService.deleteCustomer(id);
    	return "Deleted "+id;
    }
    
    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable int id)
    {
    	return customerService.findCustomerById(id);
    }
    @PutMapping("/customers")
    public String updateCustomer(@RequestBody Customer customerObj)
    {   
    	customerService.updateCustomer(customerObj);
    	return "Updated";
    }
}
