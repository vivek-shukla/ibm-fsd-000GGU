package comm.exception;

import java.io.Serializable;

public class Account implements Serializable { 
	private String accountNumber;
	private double amount;
	
	public Account() {
		super();
	}

	public Account(String accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account createAccount(String accNumber,double amt) throws AccountNotValid
	{
		this.accountNumber = accNumber;
		this.amount = amt;
		if(amount<10000)
		{
			throw new AccountNotValid("Amount must be greater than 10000");
		}
		else
		{
			System.out.println("Account created");
		}
		return new Account(accountNumber,amount);
	}
	
	

}
