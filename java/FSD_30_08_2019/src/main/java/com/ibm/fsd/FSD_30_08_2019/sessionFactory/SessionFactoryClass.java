package com.ibm.fsd.FSD_30_08_2019.sessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.fsd.FSD_30_08_2019.AnnotatedClass.Employee;

public class SessionFactoryClass {
  
	private SessionFactory sessionFactoryObj;

	public SessionFactoryClass() {
		super();
	}
	
	public SessionFactory getSessionFactoryObj()
	{
		sessionFactoryObj = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		return sessionFactoryObj;
	}
}
