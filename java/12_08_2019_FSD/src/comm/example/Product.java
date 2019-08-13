package comm.example;

public class Product {  
	private static int item;
	private int currentRate; 
	
	public Product() {
		super();
	}

	public Product(int currentRate) {
		super();
		this.currentRate = currentRate;
	} 
	public int incrementItem()
	{
		item++;
		return item;
	}

	@Override
	public String toString() {
		return "Product: \n currentRate=" + currentRate + "itemCount "+ item + "\n";
	}
	
	

}
