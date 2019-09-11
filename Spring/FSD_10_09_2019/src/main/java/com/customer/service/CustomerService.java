package com.customer.service;

import java.util.List;

import com.customer.Customer;

public interface CustomerService {
  
	public void insertCustomer(Customer customerObj);
	   public List<Customer> findAllCustomer();
	   public Customer findCustomerById(int id);
	   public void updateCustomer(Customer customerObj);
	   public void deleteCustomer(int id);
}
