package comm.example.client;

/* import comm.example.MyDate; */
import comm.practise.MyDate;
import comm.example.ConstructorClass;

public class Tester { 
	public static void main (String[] args)
	{
		MyDate myDate = null; /* creating reference in stack and assigning null to it */
		myDate = new MyDate();
		ConstructorClass myConst = new ConstructorClass();
		/* myDate.createDate(19, 12, 1999); */
	    if(myDate.setDay(16))
	    {
	    	System.out.println(myDate.getDay());
	    }
	    if(myDate.setMonth(11))
	    { 
	    	System.out.println(myDate.getMonth());
	    }
	    if(myDate.setYear(1996))
	    {
	    	System.out.println(myDate.getYear());
	    }
	    
	    System.out.println("DD/MM/YYYY \n"+myDate.getDay()+"/"+myDate.getMonth()+"/"+myDate.getYear());
	    System.out.println(myConst.getXY());
	    
	}

} 
