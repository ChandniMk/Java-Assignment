/**
 * 39. Write a Java program to arrange the elements of a given array of integers where all positive integers appear before all the negative integers.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Q39 {

	public static void main(String[] args) {

		int[] arr = { 8, -5, 3, -1, 6 };
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.print("Positive integers appear before all the negative integers: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
