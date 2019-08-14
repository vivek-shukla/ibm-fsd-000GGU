package comm.exception.practise;
import java.util.Scanner;
public class PersonMain {

	public static void main(String[] args) {
	 String firstName,lastName,choice;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter First Name: ");
	 firstName = scanner.next();
	 System.out.println("Enter First Name: ");
	 lastName = scanner.next();
	 try {
		Person prevPerson = new Person(firstName,lastName);
		System.out.println("******First Object Created*********");
		 do { 
			 System.out.println("Wanna create a new object (Y/N)");
			 choice = scanner.next(); 
			 if(choice.equals("Y") || choice.equals("y"))
			 {   
				 System.out.println("Enter First Name: ");
				 firstName = scanner.next();
				 System.out.println("Enter Last Name:");
				 lastName = scanner.next();
				try 
				{   
					Person currPerson = new Person(firstName,lastName);
					System.out.println(currPerson+" "+prevPerson);
					boolean isExist = prevPerson.isEqual(currPerson);
					 if(!isExist)
					 {
						 System.out.println("New Person Created");
						 prevPerson = currPerson;
					 } 
				}
				catch(NameNotValid e)
				{
					System.err.println(e.getMessage());
				}
				 
			 }
			 else {
				System.out.println("Enter a valid choice"); 
			 }	   
			}
		 while(choice !="N");
			
			 
		 }
		  catch (NameNotValid e) {
		 System.err.println(e.getMessage());
	  }
	
	 
		// TODO Auto-generated method stub
//      Person p = new Person();
//      try {
//		p.createPerson("Vivek", "Shukla");
//	} catch (NameNotValid e) {
//		// TODO Auto-generated catch block
//		System.err.println(e.getMessage());
//	}
//      try {
//  		p.createPerson("Anuj", "Ojha");
//  	   } catch (NameNotValid e) {
//  		// TODO Auto-generated catch block
//  		System.err.println(e.getMessage());
//  	  }
//      try
//  	 {
//  		Person p2 = new Person("Chirag","vixit");
//  	 }
//      catch(NameNotValid e )
//      {
//    	  System.err.println(e.getMessage());
//      }
      
	}
	
	

}
