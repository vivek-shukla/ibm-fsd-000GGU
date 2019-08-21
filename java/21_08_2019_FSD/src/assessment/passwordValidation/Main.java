package assessment.passwordValidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String password;
      System.out.println("Enter password");
      Scanner scanner = new Scanner(System.in);
      password = scanner.next();
      if(UserMainCode.checkPassword(password))
      {
    	  System.out.println("Valid Password");
      }
      else
      {
    	  System.out.println("Invalid Password");
      }
	}

}
