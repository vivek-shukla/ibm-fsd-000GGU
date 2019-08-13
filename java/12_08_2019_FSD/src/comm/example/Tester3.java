package comm.example;

public class Tester3 { 
	public static void main (String[] args)
	{
		Account ac1 = new Account("Vivek",5000);
		Account ac2 = new Account("Vivek",5000);
		Account ac3 = new Account("Vikram",8770);
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac1.equals(ac2));
		System.out.println(ac1.equals(ac3));
		System.out.println(ac1==ac3);
		ac1 = ac3;
		System.out.println(ac1.equals(ac3));
	}

}
