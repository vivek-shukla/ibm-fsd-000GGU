package comm.thread;

public class ThreadDemo implements Runnable {
    
	public static void main(String[] args)
	{
		ThreadDemo myThread = new ThreadDemo();
		Thread2 myThread2 = new Thread2();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread2);
		t1.start();
//		t2.start();
		t3.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
		{
			System.out.println("=> "+i);
			if(i==25)
			{
				try {
					Thread.sleep(20000);
					System.out.println("Wait over");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
