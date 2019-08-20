package comm.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import comm.employeeServices.EmployeeServiceClass;
import comm.jdbc.EmployeeModel;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scanner = new Scanner(System.in);
		try {
			EmployeeServiceClass employeeServiceObj = new EmployeeServiceClass();
			int choice = 0;
			do { 
				
				System.out.println("Welcome to Employee db management");
				System.out.println("\n 1. Insert Employee \n 2. View All Employee \n 3. Delete Employee by id \n 4. Update Employee by id\n 0: exit");
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
				switch(choice)
				{
					case 1: 
						System.out.println("Enter Employee Id");
						int id = scanner.nextInt();
						System.out.println("Enter Employee First Name");
						String fName = scanner.next();
						System.out.println("Enter Employee Last Name");
						String lName = scanner.next();
						System.out.println("Enter Employee Email");
						String email = scanner.next();
						employeeServiceObj.inserstEmployee(new EmployeeModel(id,fName,lName,email) );
						break;
					case 2: 
						List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
						empList= employeeServiceObj.viewAllEmployee();
						System.out.println("Id\t Name \t email");
						for(EmployeeModel emp: empList)
						{
							System.out.printf("\n %d\t%s %s\t%s",emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getEmail());
						}
						break;
					case 3: 
						System.out.println("Enter employee id to delete");
						id = scanner.nextInt();
						employeeServiceObj.deleteEmployee(id);
						break;
					case 4:
						System.out.println("Enter Employee Id to be updated");
						 id = scanner.nextInt();
						System.out.println("Enter Employee First Name");
						 fName = scanner.next();
						System.out.println("Enter Employee Last Name");
						 lName = scanner.next();
						System.out.println("Enter Employee Email");
						 email = scanner.next();
						 employeeServiceObj.updateEmployee(id, fName, lName, email);
						 break;
						
					case 0: System.out.println("***Exiting Program******");
					         choice = 0;
					         break;
					default: 
						System.out.println("Enter a valid choice");
						break;
				
				
				}
				
			}
			while(choice!=0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		   	e.getMessage();
		   	e.printStackTrace();
		}
		

	}

}
