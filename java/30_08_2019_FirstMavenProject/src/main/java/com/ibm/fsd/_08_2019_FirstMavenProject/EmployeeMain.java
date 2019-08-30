package com.ibm.fsd._08_2019_FirstMavenProject;

import java.util.List;
import java.util.Scanner;

import com.ibm.fsd._08_2019_FirstMavenProject.sessionDao.SessionDao;

import java.lang.System;
public class EmployeeMain { 
	
	public static void main(String[] args)
	{
		String fName,lName,email;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name");
		fName = scanner.next();
		System.out.println("Enter Last Name");
		lName = scanner.next();
		System.out.println("Enter email");
		email = scanner.next();
		SessionDao sessionDaoObj = new SessionDao();
//		sessionDaoObj.insertEmployee(new Employee(fName,lName,email));
		System.out.println("Inserted");
		List<Employee> empList = sessionDaoObj.getAllEmployee();
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		
	}
	
	
	
	

}
