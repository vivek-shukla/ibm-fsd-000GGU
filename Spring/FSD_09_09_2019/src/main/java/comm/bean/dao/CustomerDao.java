package comm.bean.dao;

import java.util.List;

import comm.bean.entity.Customer;

public interface CustomerDao {
  
	public void insertCustomer(Customer theCustomer);
	public List<Customer> listCustomer();
	public void deleteCustomer(int id);
	public Customer findCustomer(int id);
	public void updateCustomer(Customer customerObj);
	public List<Customer> searchCustomer(String searchBy);
}
