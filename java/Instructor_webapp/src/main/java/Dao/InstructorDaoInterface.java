package Dao;

import java.util.List;

import Entity.Instructor;

public interface InstructorDaoInterface {
  
	public void createInstructor(Instructor instructor);
	public List<Instructor> fetchAllInstructor();
	public void deleteInstructor(Instructor instructor);
}
