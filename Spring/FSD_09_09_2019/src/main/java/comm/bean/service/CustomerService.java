package comm.bean.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.bean.dao.CustomerDao;
import comm.bean.dao.CustomerDaoClass;
import comm.bean.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public void insertCustomer(Customer theCustomer)
	{
		customerDao.insertCustomer(theCustomer);
	} 
	
	public List<Customer> fetchCustomer()
	{
		return customerDao.listCustomer();
	}
	public void deleteCustomer(int id)
	{
		customerDao.deleteCustomer(id);
	}
	public Customer findCustomer(int id)
	{
		return customerDao.findCustomer(id);
	}
	public void updateCustomer(Customer customerObj)
	{
		customerDao.updateCustomer(customerObj);
	}
	public List<Customer> searchBy(String criteria)
	{
		return customerDao.searchCustomer(criteria);
	}

}
