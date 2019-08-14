package comm.CollectionsAndGeneric;
import java.util.Set;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionDemo {
   
	private String[] str;
	private Set set;
	public CollectionDemo() { 
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of elements to be inserted :");
	    try {
		  str = new String[scanner.nextInt()];
		  for(int i = 0; i<str.length;i++)
		  {
			  System.out.println("Enter element ");
			  str[i] = scanner.next().toLowerCase();
		  }
		  set = new HashSet<String>();
		  for(String arrayElement:str)
		  {
			  if(!set.add(arrayElement))
			  {
				  System.out.println("Duplicate elementt found "+arrayElement);
			  }
		  }
		  Iterator iterateSet = set.iterator();
		  while(iterateSet.hasNext())
		  {
			  System.out.println(iterateSet.next().toString());
		  }
	     }
	    catch(InputMismatchException wrongInp)
	    {
	    	System.out.println(wrongInp.getMessage());
	    }
	    catch(Exception e)
	    {
	    	
	    }
		
	}
	
	
}
