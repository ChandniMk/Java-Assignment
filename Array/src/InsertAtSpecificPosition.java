/**
 * 9. Write a Java program to insert an element (specific position) into an array.
 * 
 * @author Chandni
 */

import java.util.Arrays;

public class InsertAtSpecificPosition {

	private static int[] insert(int[] arr, int value, int index) {
		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		newArr[index] = value;

		for (int i = index + 1; i <= arr.length; i++) {
			newArr[i] = arr[i - 1];
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 1, 6 };
		int value = 7;
		int index = 2;

		System.out.print("Before: ");
		System.out.println(Arrays.toString(arr));

		System.out.print("After: ");
		arr = insert(arr, value, index);
		System.out.println(Arrays.toString(arr));

	}
}
