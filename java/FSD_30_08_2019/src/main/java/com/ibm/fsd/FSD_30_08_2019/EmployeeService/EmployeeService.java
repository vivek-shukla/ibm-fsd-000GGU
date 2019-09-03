package com.ibm.fsd.FSD_30_08_2019.EmployeeService;

import java.util.List;

import com.ibm.fsd.FSD_30_08_2019.AnnotatedClass.Employee;
import com.ibm.fsd.FSD_30_08_2019.sessionFactoryDao.ServiceFactoryDao;

public class EmployeeService { 
	 private ServiceFactoryDao sessionFactoryDaoObj;

	public EmployeeService() {
		super();
		sessionFactoryDaoObj = new ServiceFactoryDao();
	}
	
	public void insertEmployee(Employee emp)
	{
		sessionFactoryDaoObj.insertEmployee(emp);
	}
	public List<Employee> getAllEmployee()
	{
		return sessionFactoryDaoObj.listAllEmployee();
	}
	public List<Employee> findBy(String criteria)
	{
		switch(criteria)
		{
		case "fName": 
			return sessionFactoryDaoObj.findByFirstName("fName");
		case "lName":
			break;
		case "email":
			break;
		default:
			System.out.println("Enter a valid choice");
			break;
		
		}
	}
	 
	 

}
