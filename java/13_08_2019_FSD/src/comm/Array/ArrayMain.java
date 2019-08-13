package comm.Array;
import java.util.Arrays;
public class ArrayMain {  
  public static void main(String[] args)
  {   int index;
//	  System.out.println(ArrayDemo.createArray(26));
	  char[] charArray = ArrayDemo.createArray(26);
//	  for(char item:ArrayDemo.createArray(26)) {
//		  System.out.print(item+" |");  // system.out.print() to print in same line 
//	  } 
	  System.out.println(ArrayDemo.searchElement('1'));
	  int arr[] = {
			  100,1,-20,30,0
	  };

	  Arrays.sort(arr);
	  for(int item:arr)
	  {
		  System.out.println(item);
		  
		  index = Arrays.binarySearch(arr, item);
		  System.out.println("Element "+ item + "is found at "+index+" position");
	  }
	  
	  
	  
	  
	  
  }

}
