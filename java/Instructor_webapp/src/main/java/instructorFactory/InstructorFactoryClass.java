package instructorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstructorFactoryClass {
	private static SessionFactory factory;
	private static Session session;
	static 
	{
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public static Session getSession()
	{
		session = factory.openSession();
		return session;
	}
	
	

}
