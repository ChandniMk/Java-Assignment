/**
 * 28. Write a Java program to get the difference between the largest and smallest values in an array of integers.
 * The length of the array must be 1 and above.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class DifferenceBtwLargestandSmallest {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		Arrays.sort(arr);
		int smallestValue = arr[0];
		int largestValue = arr[arr.length - 1];
		System.out.println("Difference: " + (largestValue - smallestValue));
	}

}
