package comm.thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
		{
			System.out.println("2=> "+i);
		}
	}

}
