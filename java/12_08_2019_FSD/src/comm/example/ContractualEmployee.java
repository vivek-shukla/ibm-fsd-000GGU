package comm.example;

public class ContractualEmployee extends Employee { 
	
	private int ratePerHour;

	public ContractualEmployee() {
		super();
	}

	public ContractualEmployee(int ratePerHoue) {
		super(2,"Vikram");
		this.ratePerHour = ratePerHoue;
	}
    protected String getDetails()
    {
    	return super.getDetails()+"\n Rate per hour"+ratePerHour;
    }
	

}
