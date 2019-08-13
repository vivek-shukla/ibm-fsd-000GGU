package comm.example;

public class TV extends Electronics {  
	
	private String brand;

	public TV() {
		super();
	}

	public TV(String brand) {
		super(2019);
		// TODO Auto-generated constructor stub
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString()+"TV \n brand=" + brand + "\n";
	}
	
	
	

}
