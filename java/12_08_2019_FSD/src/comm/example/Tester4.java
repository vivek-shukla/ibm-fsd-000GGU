package comm.example;

public class Tester4 {
  
	public static void main (String[] args)
	{   int[] q = new int[8];
//	    q[9]= 13;
	    
		Product p = new Product();
		p = new Book("The Vinci Code","Dan Brown");
		System.out.println(p);
		p = new Electronics(1997);
		System.out.println(p);
		p = new TV("TOSHIBA");
		System.out.println(p);
		
		System.out.println(p.getClass());
         
//		Product[] productArray;
	}
}
