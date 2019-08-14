package comm.exception;

public class AccountMain {

	public static void main(String[] args) throws AccountNotValid {
		
		Account acountOne = new Account();
		try
		{
			acountOne.createAccount("YESB2001", 2000.00);	
		}
		catch(AccountNotValid e )
		{
			System.err.println(e.getMessage());
		}
		try
		{
			acountOne.createAccount("YESB2001", 28000.00);	
		}
		catch(AccountNotValid e )
		{
			System.err.println(e.getMessage());
		}
		

	}

}
