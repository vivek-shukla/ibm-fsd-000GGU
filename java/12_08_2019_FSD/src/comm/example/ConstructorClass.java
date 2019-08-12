package comm.example; 

public class ConstructorClass { 
	private int x;
	private int y;
	
	public ConstructorClass() {
		this(10); /* */
	} 
	
	public ConstructorClass(int x) { 
		this(x,20); 
		this.x = 50;
		
}

	public ConstructorClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getXY()
	{
        return "x= "+x+" y = "+y;		
	}
	

}
