package comm.Synchronized;

import java.lang.reflect.Array;

public class MyStack {
   
	private int MAX=26;
	private int TOP=-1;
	private char stack[]= new char[MAX];
	
	public synchronized void push(char item) throws InterruptedException
	{
		if(TOP==MAX-1)
		{
			System.out.println("stack overflow");
			System.out.println("Producer is waiting");
			wait();
		}
		
			stack[++TOP]=item;
			System.out.println("pushed "+item);
			System.out.println(" Consumer notified ");
			notifyAll();
		
	}
	public synchronized char pop() throws InterruptedException
	{
		if(TOP==-1)
		{
			System.out.println("Stack Underflow");
			wait();
		}
		
		System.out.println(" Producer notified");
		notifyAll();
		System.out.println("Pop: "+stack[TOP]);
		return	stack[TOP--];
		
	}
	
}
