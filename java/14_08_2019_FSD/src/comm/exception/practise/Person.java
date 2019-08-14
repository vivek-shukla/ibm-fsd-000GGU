package comm.exception.practise;

import java.io.Serializable;
import java.lang.Character;
public class Person implements Serializable { 
	private String firstName;
	private String lastName;
	
	
	public Person() {
		super();
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName) throws NameNotValid {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(Character.isUpperCase(firstName.charAt(0)) && Character.isUpperCase(lastName.charAt(0)) ) 
		{  
			System.out.println("Contructor called");
		}
		else
		{
			throw new NameNotValid(" Name should be in title format ");
		}
	} 
	
	public Person createPerson(String fName, String lName) throws NameNotValid
	{
		if(Character.isUpperCase(fName.charAt(0)) && Character.isUpperCase(lName.charAt(0)) ) 
		{  
			System.out.println("Person created");
			return new Person(fName,lName);
		}
		else
		{
			throw new NameNotValid(" Name should be in title format ");
		}
	}
	
	public boolean isEqual(Object obj) throws NameNotValid
	{
		Person newPerson = (Person)obj;
		if(this.firstName.equals(newPerson.firstName)  && this.lastName.equals(newPerson.lastName))
		{
			throw new NameNotValid(" User already exist ");
		
		}
		else
		{
			return false;
		}
		
	}
	
	
	

}
