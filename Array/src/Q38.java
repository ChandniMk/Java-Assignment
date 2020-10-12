/**
 * 38. Write a Java program to arrange the elements of a given array of integers where all negative integers appear before all the positive integers.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Q38 {

	public static void main(String[] args) {

		int[] arr = { 8, -5, 3, -1, 6 };
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.print("Negative integers appear before all the positive integers: ");
		System.out.println(Arrays.toString(arr));
	}
}
