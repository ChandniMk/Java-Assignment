/**
 * 8. Write a Java program to copy an array by iterating the array.
 * 
 * @author Chandni
 */

import java.util.Arrays;

public class Copy {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		int[] newArr = new int[arr.length];

		System.out.print("Before: ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		System.out.print("After: ");
		System.out.println(Arrays.toString(newArr));
	
	}

}
