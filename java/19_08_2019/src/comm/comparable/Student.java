package comm.comparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
     private String firstName,lastName,address;
     int age,id;
     double gpa;
     
    private static Set<Student> studentArray = new TreeSet<Student>();
    
	public Student() {
		super();
	}


	public Student(String firstName, String lastName, String address, int age, double gpa,int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.gpa = gpa;
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}



	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static void insertStudent(Student studentObj)
	{
		studentArray.add(studentObj);
	}
	public static void viewStudent()
	{   System.out.println("Name \t Address\t Age\t Gpa");
		for(Student st:studentArray)
		{
			System.out.println(st.getFirstName()+" "+st.getLastName()+"\t"+st.getAddress()+"\t"+st.getAge()+"\t"+st.getGpa());
		}
	}
	public static void findStudent(int id)
	{   int flag=0;
		for(Student student:studentArray)
		{
			if(student.getId()==id)
			{
				System.out.println(student.toString());
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Student Not found");
		}
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getGpa()==o.getGpa())
		   return 0;
		else if(this.getGpa()>o.getGpa())
			return 1;
		else return -1;
	}

}
