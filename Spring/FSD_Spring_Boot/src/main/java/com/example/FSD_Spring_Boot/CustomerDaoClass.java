package com.example.FSD_Spring_Boot;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoClass implements CustomerDao {
    
	private EntityManager manager;
    private Session session;
    @Autowired
    public CustomerDaoClass(EntityManager manager) {
		super();
		this.manager = manager;
		
	}

	public CustomerDaoClass() {
		super();
		
	}
	
	@Override
	@Transactional
	public void insertCustomer(CustomerClass customerObj) {
		// TODO Auto-generated method stub
		session = manager.unwrap(Session.class);
		session.saveOrUpdate(customerObj);

	}

	@Override
	@Transactional
	public List<CustomerClass> findAllCustomer() {
		// TODO Auto-generated method stub
		session = manager.unwrap(Session.class);
		Query<CustomerClass> q = session.createQuery("from CustomerClass",CustomerClass.class);
		return q.getResultList();
	}

	@Override
	public CustomerClass findCustomerById(int id) {
		// TODO Auto-generated method stub
		session = manager.unwrap(Session.class);
		CustomerClass customerClass = session.find(CustomerClass.class,id);
		return customerClass;
	}

	@Override
	public void updateCustomer(CustomerClass customerObj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int id) {
		

	}
	@PreDestroy
	public void destroyCustomer()
	{
		session.close();
	}

}
