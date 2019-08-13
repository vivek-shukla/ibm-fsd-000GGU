package comm.example;

public class Employee { 
	private int id;
	private String name;
	public Employee() {
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	protected String getDetails()
	{
		return "Id: "+id+"\n Name:"+name;
	} 
	

}
