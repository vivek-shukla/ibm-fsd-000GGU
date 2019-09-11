package com.example.FSD_Spring_Boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceClass implements CustomerService {
    @Autowired
	private CustomerDao customerDao;
	@Override
	public void insertCustomer(CustomerClass customerObj) {
		// TODO Auto-generated method stub
		customerDao.insertCustomer(customerObj);

	}

	@Override
	public List<CustomerClass> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAllCustomer();
	}

	@Override
	public CustomerClass findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public void updateCustomer(CustomerClass customerObj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

}
