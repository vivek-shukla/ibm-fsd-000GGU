package com.Dao;

import org.hibernate.Session;

import com.Entity.CDEntity;
import com.factory.SessionFactoryClass;

public class SessionFactoryDao { 
	public static Session session;
	static
	{
		session = SessionFactoryClass.getSession();
	}
	public void insertCD(CDEntity cdObj)
	{
		session.getTransaction().begin();
		session.persist(cdObj);
		session.getTransaction().commit();
	}

}
