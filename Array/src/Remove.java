/**
 * 7. Java program to remove a specific element from an array.
 * 
 * @author Chandni
 */

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		int[] newArr = new int[arr.length - 1];

		System.out.print("Before: ");
		System.out.println(Arrays.toString(arr));

		int removeIndex = 3;
		for (int j = 0, k = 0; j < arr.length; j++) {
			if (j == removeIndex) {
				continue;
			}
			else {
			newArr[k++] = arr[j];
			}
		}

		System.out.print("After: ");
		System.out.println(Arrays.toString(newArr));
	}

}
