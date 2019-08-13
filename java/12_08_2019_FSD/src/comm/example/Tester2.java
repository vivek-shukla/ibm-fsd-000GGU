package comm.example;
public class Tester2 {
	public static void main(String[] args)
	{
		Employee p = new Employee();
		p= new PermanentEmployee(1000);
		System.out.println(p.getDetails());
		p = new ContractualEmployee(15);
		System.out.println(p.getDetails());
		
				
	}

}
