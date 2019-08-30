package com.ibm.fsd._08_2019_FirstMavenProject.sessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.fsd._08_2019_FirstMavenProject.Employee;

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
