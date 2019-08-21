package comm.Synchronized;

public class Main {
    private static MyStack myStackObj = new MyStack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer producerObj = new Producer(myStackObj);
		Consumer consumerObj = new Consumer(myStackObj);
		Thread p = new Thread(producerObj);
		Thread c = new Thread(consumerObj);
		p.start();
		c.start();
		

	}

}
