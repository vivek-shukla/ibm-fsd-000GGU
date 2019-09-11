package com.customer.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customer.Customer;
@Repository
public class CustomerDaoClass implements CustomerDao {
    @Autowired
	private SessionFactory sessionFactory;
    private Session session;
    
    @PostConstruct
    public void createSession()
    {
    	session = sessionFactory.openSession();
    }
	@Override
	@Transactional
	public void insertCustomer(Customer customerObj) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(customerObj);

	}

	@Override
	@Transactional
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		Query<Customer> q = session.createQuery("from Customer",Customer.class);
		return q.getResultList();
	}

	@Override
	@Transactional
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customerObj = session.find(Customer.class, id);
		 return customerObj;
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customerObj) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		session.merge(customerObj);
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
    	Customer toDeleteObj = session.find(Customer.class, id);
    	session.delete(toDeleteObj);
    	session.getTransaction().commit();

	}

}
