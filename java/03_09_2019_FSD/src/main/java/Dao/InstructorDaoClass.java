package Dao;

import java.util.List;

import org.hibernate.Session;

import Entity.Instructor;
import instructorFactory.InstructorFactoryClass;

public class InstructorDaoClass implements InstructorDaoInterface {
	private static Session session;
	static
	{
		session = InstructorFactoryClass.getSession();
	}

	@Override
	public void createInstructor(Instructor instructor) {
		session.getTransaction().begin();
		session.persist(instructor);
		session.getTransaction().commit();
		// TODO Auto-generated method stub
	}

	@Override
	public List<Instructor> fetchAllInstructor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		// TODO Auto-generated method stub

	}

}
