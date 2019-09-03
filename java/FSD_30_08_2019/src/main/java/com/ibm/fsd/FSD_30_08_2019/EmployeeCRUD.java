package com.ibm.fsd.FSD_30_08_2019;

import java.util.List;
import java.util.Scanner;

import com.ibm.fsd.FSD_30_08_2019.AnnotatedClass.Employee;
import com.ibm.fsd.FSD_30_08_2019.EmployeeService.EmployeeService;

public class EmployeeCRUD { 
	public static void main(String[] args)
	{
		String fName,lName,email;
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeServiceObj = new EmployeeService();
		
		do
		{ 
			System.out.println("Welcome to Hibernate Employee crud \n Enter your choice ");
			System.out.println("1.Create \n2. Search All\n3. Delete \n4. Find\n5. Update");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter first name");
				fName = scanner.next();
				System.out.println("Enter last name");
				lName = scanner.next();
				System.err.println("Enter email");
				email = scanner.next();
				employeeServiceObj.insertEmployee(new Employee(fName,lName,email));
				System.out.println("Inserted");
				break;
			case 2:
				List<Employee> empList = employeeServiceObj.getAllEmployee();
				displayEmployeeList(empList);
				break;
			case 4:
				
				int findChoice=0;
				
				do {
					System.out.println("Find by \n\t1.First Name \n\t2.Lat Name \n\t3.email \n\t4.id");
					findChoice = scanner.nextInt(); 
					switch(findChoice)
						{
						  case 1: 
							  System.out.println("Enter first name");
							  
							  break;
						  case 2: 
							  System.out.println("Enter Last Name");
							  break;
						  case 3: 
							  System.out.println("Enter email");
							  break;
						  case 4:
							  System.out.println("Enter id");
							  break;
						  default:
							  System.out.println("Invalid choice");
						}
					
					}while(findChoice!=0);
				break;
			default:
				System.out.println("Invalid choice ");
				break;
			}
			
			
		}while(choice!=0);
	}
	
	 public static void displayEmployeeList(List<Employee> empList)
	 {
		 for(Employee emp:empList)
		 {
			 System.out.println(emp);
		 }
	 }
	

}
