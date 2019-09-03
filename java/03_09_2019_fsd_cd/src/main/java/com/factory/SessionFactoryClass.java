package com.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryClass {
 
	public static SessionFactory sessionFactory;
	public static Session session;
	static
	{
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public static Session getSession()
	{
		session = sessionFactory.openSession();
		return session;
	}
}
