/**
 * 23. Write a Java program to test the equality of two arrays.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Equality {
	public static String equal(int[] arr1, int[] arr2) {
		if (Arrays.equals(arr1, arr2)) {
			return "Equal";
		}
		else {
			return "Not Equal";
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 2, 3, 1 };
		
		System.out.println("The two arrays are " + equal(arr1, arr2));
		System.out.println("The two arrays are " + equal(arr3, arr2));
	}
}
