package comm.example;

public class Account { 
	
	private String name;
	private int amount;
	public Account() {
		super();
	}
	public Account(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account ac =(Account)obj;
		if(this.name == ac.name && this.amount == ac.amount)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	 @Override
	public String toString() {
		return "Account [name=" + name + ", amount=" + amount + "]";
	} 
	
	

}
