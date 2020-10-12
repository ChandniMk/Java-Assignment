/**
 * 10. Write a Java program to find the maximum and minimum value of an array.
 * 
 * @author Chandni
 */

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 1, 6 };
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length - 1];

		System.out.println("Maximum Value = " + max+ "\nMinimum Value = " + min);
	}
}
