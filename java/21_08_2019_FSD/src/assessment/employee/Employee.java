package assessment.employee;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	private static int count=0;
	private String name,department;
	private Date dateOfJoining;
	private int id,age,salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.id = count++;
		this.age = age;
		this.salary = salary;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	
	public int compareTo(Employee emp) {
		
        if(this.getSalary()==emp.getSalary())
        	return 0;
        if(this.getSalary()>emp.getSalary())
        	return 1;
        else
        	return -1;
	}
	@Override
	public String toString() {
		return "Employee \n name=" + name + ", department=" + department + ", dateOfJoining=" + dateOfJoining + ", id="
				+ id + ", age=" + age + ", salary=" + salary + "";
	}
	
}
