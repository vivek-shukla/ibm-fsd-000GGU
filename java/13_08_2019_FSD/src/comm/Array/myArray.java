package comm.Array;

import java.util.Arrays;

public class myArray { 
	private int[] array;
	private char[] myStack;
	private int top=-1;
	private int max;
	public void sortReverseArray(int[] arr)
	{
		array = arr;
		System.out.println("Sorting array: ");
		Arrays.sort(array);
		for(int i = array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	} 
	public char[] createStack(int len)
	{   this.max = len;
		this.myStack = new char[max];
		return this.myStack;
	}
	public void push(char c)
	{    top++;
		if(this.top==this.max)
		{  
			System.out.println("stack overflow");
			
		}
		else
		{ 
			myStack[top]=c;
			System.out.println(c+" top "+top);	
		}
	}
	public char pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow");
			return '0';
		}
		else
		{   char toPop = myStack[top];
			top--;
			System.out.println("element popped: "+toPop);
			return toPop;
			
		}
	}

}
