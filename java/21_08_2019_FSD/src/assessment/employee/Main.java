package assessment.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,age,salary,noOfEmployees,choice=0;
		String department,name;
		Date dateOfJoining;
      ArrayList<Employee> empList = new ArrayList<Employee>();
      System.out.println("Enter the number of employees");
      Scanner scanner = new Scanner(System.in);
      noOfEmployees = scanner.nextInt();
      for(int i=0;i<noOfEmployees;i++)
      {
    	  System.out.println("Enter the detail of employee "+(i+1));
    	  
    	  try {
    		  System.out.println("Enter name");
        	  name = scanner.next();
        	  System.out.println("Department: ");
        	  department = scanner.next();
        	  System.out.println("Date of joining (dd/mm/yyyy)");
        	  String date= scanner.next();
        	  System.out.println("Enter age");
        	  age = scanner.nextInt();
        	  System.out.println("Enter Salary");
        	  salary = scanner.nextInt();
        	  SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
			  dateOfJoining = format.parse(date);
			  empList.add(new Employee(name,department,dateOfJoining,age,salary));
		    } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	  
      }
      do { 
    	  System.out.println("Sort Employee by");
          System.out.println("1. Sort employee by salary");
          System.out.println("1. Sort employee by salary");
          System.out.println("0:exit");
          System.out.print("Enter Your Choice: ");
          choice=scanner.nextInt(); 
          switch(choice)
          {
          case 1:
        	  EmployeeBO.printEmployees(empList);
        	  break;
          case 2:
        	  Collections.sort(empList,new AgeComparator());
        	  EmployeeBO.printEmployees(empList);  
        	  break;
          case 3:
        	  System.out.println("*****Exiting Program******");
        	  choice = 0;
        	  System.exit(0);
          default:
        	  System.out.println("Enter a valid choice");
        	  
          }
    	  
      }while(choice!=0);
      
     
      
      
      
      
	}

}
