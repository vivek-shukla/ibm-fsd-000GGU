package assessment.passwordValidation;

public class UserMainCode {
	public static boolean checkPassword(String password){
		if(password.length()<8 || password.matches("(?=.*[a-z])(?=.*\\\\d)(?=.*[A-Z])(?=.*[@#$%!])"))
			return false;
		else
			return true;
		
	}
}
