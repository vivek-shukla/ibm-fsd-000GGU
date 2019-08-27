package comm.TestDrivenDevelopment;

public class Calculator {
	private int x,y,result;
    
	

	public Calculator() {
		super();
	}



	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int addMethod()
	{
		result = x+y;
		return result;
		
	}
	public boolean isGreater()
	{
		return x>y;
	}

}
