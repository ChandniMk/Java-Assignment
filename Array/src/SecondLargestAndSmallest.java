/**
 * 17. Write a Java program to find the second largest element in an array.  
 * 
 * 18. Write a Java program to find the second smallest element in an array.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class SecondLargestAndSmallest {
	
	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 1, 6 };
		Arrays.sort(arr);
		
		int secondSmallest = arr[1];
		int secondLargest = arr[arr.length - 2];

		System.out.println("Second Largest Element = " + secondLargest+ "\nSecond Smallest Element = " + secondSmallest);
	}

}
