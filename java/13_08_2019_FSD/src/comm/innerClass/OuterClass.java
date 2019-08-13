package comm.innerClass;

public class OuterClass {  
	private int x;
	private int y;
	
	public OuterClass() {
		super();
	}

	public OuterClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void outerMethod()
	{   System.out.println("******** Outer Class ***************");
		System.out.println("x: "+x+"\n y: "+y);
		System.out.println("Outer Method called");
	}
	public class InnerClass 
	{
		public void innerMethod() 
		{  System.out.println("******** Inner Class ***************");
			x=10;
		    y=20;
			outerMethod();
			System.out.println("Inner method called");
		}
		
		public class InsideInnerClass
		{
			public void insideInnerMethod()
			{   System.out.println("********Inside Inner Class ***************");
				x=50;
			    y=50;
				outerMethod();
			    innerMethod();
			    System.out.println("Inside inner method called");
			    
				
				
			}
		}
		
	}
	

}
