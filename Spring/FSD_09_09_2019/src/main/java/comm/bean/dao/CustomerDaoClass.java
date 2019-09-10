package comm.bean.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.bean.entity.Customer;

@Repository
public class CustomerDaoClass implements CustomerDao {
    @Autowired
	private SessionFactory sessionFactory;
    private Session session;
    
    @Transactional
	public void insertCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
    	session.saveOrUpdate(theCustomer);
   
	}
    @Transactional
    public List<Customer> listCustomer()
    {   
    	Query<Customer> query = session.createQuery("from Customer",Customer.class);
    	List<Customer> cutomerList = query.getResultList();
    	
    	return cutomerList;
    	
    }
    
    
    public void deleteCustomer(int id)
    {   session.getTransaction().begin();
    	Customer toDeleteObj = session.find(Customer.class, id);
    	session.delete(toDeleteObj);
    	session.getTransaction().commit();
    }
    @Transactional
    public void updateCustomer(int id)
    { 
    	Customer toUpdateObj = session.find(Customer.class, id);
    	session.saveOrUpdate(toUpdateObj);
    	
    }
    public List<Customer> searchCustomer(String searchCriteria)
    {   
    	
	//	Query q = session.createQuery("from Customer where firstName like '%"+searchCriteria+"%' or lastName like '%"+searchCriteria+"%'or email like '%"+searchCriteria+"%'");

		Query<Customer> q = session.createQuery("from Customer where firstName=:f or lastName=:l or email=:e",Customer.class);
		    	q.setParameter("f",searchCriteria);
    	q.setParameter("l",searchCriteria);
    	q.setParameter("e", searchCriteria);
    
    	List<Customer> customerList = q.getResultList();
    	
    	
    	return customerList;
    	
    }
	public CustomerDaoClass() {
		super();
	}
	@PostConstruct
	public void createSession()
	{
		session = sessionFactory.openSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Customer findCustomer(int id) {
	  Customer customerObj = session.find(Customer.class, id);
	 return customerObj;
	}
	@Transactional
	public void updateCustomer(Customer customerObj)
	{
		session.merge(customerObj);
	}
	
	
	
	
	

}
