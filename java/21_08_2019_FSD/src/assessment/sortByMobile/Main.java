package assessment.sortByMobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;
		String name,email,mobile,address;
		List<Contact> contactList = new ArrayList<Contact>();
		System.out.println("Enter the number of records ");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter detail of employee "+(i+1));
			System.out.println("Enter Name: ");
			name = scanner.next();
			System.out.println("Enter Email: ");
			email = scanner.next();
			System.out.println("Enter Mobile: ");
			mobile = scanner.next();
			System.out.println("Enter address");
			address = scanner.next();
			contactList.add(new Contact(name,email,mobile,address));
		}
		Collections.sort(contactList);
		for(Contact contact:contactList)
		{
			System.out.println(contact.getName()+"-"+contact.getMobile());
		}
		
		
		

	}

}
