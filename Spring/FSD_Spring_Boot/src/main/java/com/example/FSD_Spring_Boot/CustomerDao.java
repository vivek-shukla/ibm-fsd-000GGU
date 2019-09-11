package com.example.FSD_Spring_Boot;

import java.util.List;


public interface CustomerDao {
  
	 public void insertCustomer(CustomerClass customerObj);
	   public List<CustomerClass> findAllCustomer();
	   public CustomerClass findCustomerById(int id);
	   public void updateCustomer(CustomerClass customerObj);
	   public void deleteCustomer(int id);
}
