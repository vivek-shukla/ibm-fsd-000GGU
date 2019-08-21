package comm.Synchronized;

public class Producer implements Runnable {
	private MyStack myStackObj;
    
	public Producer(MyStack myStackObj) {
		super();
		this.myStackObj = myStackObj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub 
		for(int i =0;i<29;i++)
		{
			try {
				myStackObj.push((char)((char)(i+65)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
