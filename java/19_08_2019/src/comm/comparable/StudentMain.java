package comm.comparable;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String fName,lName,address,choice="y";
		int age,id;
		double gpa;
		Scanner scanner = new Scanner(System.in);
		do
		{ 
			System.out.println("Select an option \n 1. Insert \n 2. View \n 3. Update \n 4. Delete \n 5. Search by Id \n 6. Exit");
			choice = scanner.next();
			switch(choice)
			{
			case "1": {
				 System.out.println("Enter Id");
				 id = scanner.nextInt();
				 System.out.println("Enter First Name");
				 fName = scanner.next();
				 System.out.println("Enter Last Name");
				 lName = scanner.next();
				 System.out.println("Enter Address");
				 address = scanner.next();
				 System.out.println("Enter Age");
				 age = scanner.nextInt();
				 System.out.println("Enter GPA");
				 gpa = scanner.nextDouble();
				 Student.insertStudent(new Student(fName,lName,address,age,gpa,id)); 
				 break;
			   }
			case "2": 
			{
				Student.viewStudent();
				break;
			}
			case "5":
			{    int idToFound;
				System.out.println("Enter id to search");
				idToFound = scanner.nextInt();
				Student.findStudent(idToFound);
				break;
				
			}
			case "6":
			{
				System.out.println("******Exiting Program*******");
				choice = "n";
				break;
			}
			default:
			{
				System.out.println("Enter a valid choice");
			}
			}
			
		}while(!(choice.equals("n")) && !(choice.equals("N")));
	}

}
