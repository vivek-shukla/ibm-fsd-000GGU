package com.example.FSD_Spring_Boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {
   @Autowired
	private CustomerService customerService;
   
   @GetMapping("/customer")
   public List<CustomerClass> fetchAllCustomer()
   {
	   return customerService.findAllCustomer();
   }
   
   @GetMapping("/customer/{id}")
   public CustomerClass fetchCustomer(@PathVariable("id") int id)
   {
	   return customerService.findCustomerById(id);
   }
   
   @PostMapping("/customer")
   public String insertCustomer(@RequestBody CustomerClass customerObj)
   {
	   customerService.insertCustomer(customerObj);
	   return "added";
   }
   
}
