/**
 * 36. Write a Java program to find smallest and second smallest elements of a given array.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Q36 {
	
	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 1, 6 };
		Arrays.sort(arr);
		
		int smallest = arr[0];
		int secondSmallest = arr[1];

		System.out.println("Smallest Value = " + smallest+ "\nSecond Smallest Value = " + secondSmallest);
	}

}
