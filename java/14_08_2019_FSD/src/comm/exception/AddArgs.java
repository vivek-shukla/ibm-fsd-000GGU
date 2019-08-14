package comm.exception;

public class AddArgs { 
	public static void main(String[] args)
	{
		int sum = 0;
		for(String num:args)
		{   try { 
			sum+= Integer.parseInt(num);
//			System.out.println(args[9]);
		  } 
		catch ( NumberFormatException nfe )
		{     System.err.println(nfe.toString());
			  System.err.println("Number format erroe ");
			  
			  System.err.println(nfe.getMessage());
//			  nfe.printStackTrace();
//			  System.err.println(nfe.getCause().toString());  
		}
		catch(ArrayIndexOutOfBoundsException aeob)
		{
			System.err.println("array index out of bound");
		}
//		catch(Exception e)
//		{
//			System.out.println("Exception voila!!!");
//		}
			
		}
		System.out.println(sum);
	}

}
