package comm.example;

public class PersonInheritance { 
	private String name;
	private String address;  /* id we make it private then we can use it in child class */
	public PersonInheritance()
	{
		System.out.println("inside default constructor of person");
	}
	public PersonInheritance(String name, String address) {
		this.name = name;
		this.address = address; 
		System.out.println("inside parameterised constructor of person");
	}
	protected String getDetails()
	{
		return "Name: "+name+" Address"+address;
	}
	

}
