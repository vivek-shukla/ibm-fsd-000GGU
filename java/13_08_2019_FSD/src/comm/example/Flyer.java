package comm.example;

public abstract class Flyer {
    
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land(); 
	public static final void sleep()
	{
		System.out.println("Flyer is sleeping");
	}
	
}
