package comm.Array;

public class multiDimensionalArray {  
	public static void main(String[] args)
	{
		int[][] myArray = new int[4][];
		myArray[0] = new int[2];
		myArray[0][0] = 12;
		System.out.println(myArray[0][0]);
		
		add();
		add(1,3,4,5);

	}
	static void add(int... var)
	{
		int sum = 0;
		for(int item:var)
		{
			sum=sum+item;
		}
		System.out.println(sum);

	}
}
