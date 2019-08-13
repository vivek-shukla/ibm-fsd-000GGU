package comm.example;

public class PermanentEmployee extends Employee {
  private int salary;

public PermanentEmployee() {
	super();
}

public PermanentEmployee(int salary) {
	super(1,"Vivek");
	this.salary = salary;
}

protected String getDetails()
 {
	return super.getDetails()+"\n Salary:"+salary;
}
  
}
