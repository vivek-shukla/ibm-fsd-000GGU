import java.util.Scanner;

import Dao.InstructorDaoClass;
import Entity.Instructor;
import Entity.InstructorDetail;

public class InstructorMain {
  
	public static void main(String[] args)
	{
		InstructorDetail instructorDetail;
		Instructor instructor;
		String youtubeChannel,fName,lName,email,hobby;
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- Enter Instructor detail ---");
		System.out.println("Enter youtube channel ");
		youtubeChannel = scanner.next();
		System.out.println("Enter hobby");
		hobby = scanner.next();
		instructorDetail = new InstructorDetail(youtubeChannel, hobby);
		System.out.println("Enter First,last name and email ");
		fName = scanner.next();
		lName = scanner.next();
		email = scanner.next();
		instructor =  new Instructor(fName,lName,email);
		instructor.setInstructorDetail(instructorDetail);
		InstructorDaoClass instructorDao2 = new InstructorDaoClass();
		instructorDao2.createInstructor(instructor);
		System.out.println("Saving data witrh instructor");
		 System.out.println("enter anything to deleter the created object");
		 String str = scanner.next();
		 instructorDao2.deleteInstructor(instructor);
		
		
	}
}
