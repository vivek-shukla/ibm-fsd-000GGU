package com.ibm.fsd._08_2019_FirstMavenProject.sessionDao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.fsd._08_2019_FirstMavenProject.Employee;
import com.ibm.fsd._08_2019_FirstMavenProject.sessionFactory.SessionFactoryClass;

public class SessionDao { 
	private SessionFactoryClass sessionFactoryObj;
	private SessionFactory factoryObj;
	private Session sessionObj;
	public SessionDao() { 
		super();
		sessionFactoryObj = new SessionFactoryClass();
		factoryObj = sessionFactoryObj.getSessionFactoryObj();
		
		
	}
	public void insertEmployee(Employee emp)
	{   sessionObj = factoryObj.openSession();
		sessionObj.getTransaction().begin();
		sessionObj.persist(emp);
		sessionObj.getTransaction().commit();
		
	}
	public List<Employee> getAllEmployee()
	{   sessionObj = factoryObj.openSession();
		sessionObj.getTransaction().begin();
		Query q = sessionObj.createQuery("from Employee");
		sessionObj.getTransaction().commit();
		return q.getResultList();
		
	}
	

}
