package comm.Array;

public class myArrayMain {  
	public static void main(String[] args)
	{
//		int[] toBeSort = {-20,100,0,20,10};
//		new myArray().sortReverseArray(toBeSort);
//		char[] mystack;
		myArray stack = new myArray();
	    stack.createStack(5);
	    stack.pop();
	    stack.push('a');
	    System.out.println(stack.pop());
	    stack.pop();
	    stack.push('c');
	    stack.push('d');
	    stack.push('e');
	    stack.push('f');
	    stack.push('g');
	    stack.pop();
	    stack.push('h');
	    stack.push('i');
	    stack.pop();
	    stack.pop();
	    stack.pop();
	    
	    
	}

}
