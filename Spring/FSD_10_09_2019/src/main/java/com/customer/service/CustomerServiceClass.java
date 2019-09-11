package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Customer;
import com.customer.dao.CustomerDao;

@Service
public class CustomerServiceClass implements CustomerService {
    @Autowired
	private CustomerDao customerDao;
	@Override
	public void insertCustomer(Customer customerObj) {
		// TODO Auto-generated method stub
         customerDao.insertCustomer(customerObj);
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAllCustomer();
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customerObj) {
		// TODO Auto-generated method stub
         customerDao.updateCustomer(customerObj);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);

	}

}
