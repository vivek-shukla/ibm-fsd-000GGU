package comm.Synchronized;

public class Consumer implements Runnable {
	private MyStack myStackObj;
	
	public Consumer(MyStack myStackObj) {
		super();
		this.myStackObj = myStackObj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<26;i++)
		{
			try { 
				if(i==0)
					Thread.sleep(20000);
				myStackObj.pop();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
