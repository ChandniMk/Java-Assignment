
/**
 * 30. Write a Java program to check if an array of integers without 0 and -1.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class Q30 {

	public static boolean contains(int[] arr) {
		for (int arr1 : arr) {
			if (arr1 == 0 || arr1 == -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, -1, 6 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Without 0 and -1? : " + contains(arr));
		
		int[] arr1 = { 8, 5, 3, 1, 6 };
		System.out.println("\nArray: " + Arrays.toString(arr1));
		System.out.println("Without 0 and -1? : " + contains(arr1));
		
		int[] arr2 = { 8, 5, 3, 0, 6 };
		System.out.println("\nArray: " + Arrays.toString(arr2));
		System.out.println("Without 0 and -1? : " + contains(arr2));
		
		int[] arr4 = { 8, 5, 0, -1, 6 };
		System.out.println("\nArray: " + Arrays.toString(arr4));
		System.out.println("Without 0 and -1? : " + contains(arr4));
	}

}
