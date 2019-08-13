package comm.example;

public class Electronics extends Product { 
	private int manYear;

	public Electronics() {
		super();
	}

	public Electronics(int manYear) {
		super(10000);
		this.manYear = manYear;
		super.incrementItem();
	}

	@Override
	public String toString() {
		return super.toString()+"Electronics \n manYear=" + manYear + "\n";
	}
	
	

}
