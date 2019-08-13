package comm.example;

public class ModelMain {
   public static void main(String[] args)
   {
	   Model l1 = new Line(0,30);
	   Model l2 = new Line(0,20);
	   Model l3 = new Line(10,40);
	   System.out.println(l1.isGreater(l1, l2));
	   System.out.println(l1.isEqual(l3));
	   System.out.println(l1.isLess(l2));
	   
	   
	   
   }
}
