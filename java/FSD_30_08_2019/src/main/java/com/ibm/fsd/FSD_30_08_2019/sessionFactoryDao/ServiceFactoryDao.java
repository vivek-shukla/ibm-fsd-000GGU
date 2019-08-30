package com.ibm.fsd.FSD_30_08_2019.sessionFactoryDao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.fsd.FSD_30_08_2019.AnnotatedClass.Employee;
import com.ibm.fsd.FSD_30_08_2019.sessionFactory.SessionFactoryClass;

public class ServiceFactoryDao {
   private SessionFactoryClass sessionFactoryClassObj;
   private SessionFactory sessionFactoryObj;
   private Session sessionObj;
	public ServiceFactoryDao() {
		super();
		sessionFactoryClassObj = new SessionFactoryClass();
		sessionFactoryObj = sessionFactoryClassObj.getSessionFactoryObj();
	}
	
	public void insertEmployee(Employee emp)
	{
		sessionObj = sessionFactoryObj.openSession();
		sessionObj.getTransaction().begin();
		sessionObj.persist(emp);
		sessionObj.getTransaction().commit();
	}
	public List<Employee> listAllEmployee()
	{
		sessionObj = sessionFactoryObj.openSession();
		sessionObj.getTransaction().begin();
		Query q = sessionObj.createQuery("from Employee");
		sessionObj.getTransaction().commit();
		return q.getResultList();
	}
   
   
   
   
}
