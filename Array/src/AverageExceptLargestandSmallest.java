/**
 * 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class AverageExceptLargestandSmallest {
	
	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		Arrays.sort(arr);
		int smallestValue = arr[0];
		int largestValue = arr[arr.length - 1];
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
		float avg = ((sum - smallestValue - largestValue)/(arr.length-2));
		System.out.println("Average: " + avg);
	}

}
