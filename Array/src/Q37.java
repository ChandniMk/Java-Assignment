/**
 * 37. Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Q37 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1, 0 };
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.print("After Segregation: ");
		System.out.println(Arrays.toString(arr));
	}
}
