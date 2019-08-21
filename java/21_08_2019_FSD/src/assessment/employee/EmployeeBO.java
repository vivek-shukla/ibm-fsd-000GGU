package assessment.employee;

import java.util.List;

public class EmployeeBO {
   
	public static void printEmployees(List<Employee> employeeList)
	{
		for(Employee emp:employeeList)
		{
			System.out.printf("%-15s %-30s %-30s %-10s %-10s %-20s\n",emp.getId(),emp.getName(),emp.getDepartment(),emp.getDateOfJoining(),emp.getAge(),emp.getSalary());
		}
	}
}
