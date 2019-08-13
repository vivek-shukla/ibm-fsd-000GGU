package comm.Array;
import java.util.Arrays;

public class ArrayDemo { 
	private static char array[];
	
	public ArrayDemo() {
		super();
	}

	public static char[] createArray(int length)
	{
		array = new char[length];
		char base ='A';
		for (int i=0; i<array.length;i++)
		{
			array[i]=(char) (base + i);
		}
		
		return array;
	}
	public static int searchElement(char key)
	{
		Arrays.sort(array);
		return Arrays.binarySearch(array,key);
		
	}
	

}
