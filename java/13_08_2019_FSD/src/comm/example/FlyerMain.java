package comm.example;

public class FlyerMain {  
	public static void main(String[] args)
	{
		Flyer f = new Bird();
		f.takeOff();
		f.land();
		f = new Superman();
		f.takeOff();
		f.land();
		Bird b = new Bird();
		b.sleep();
	}

}
