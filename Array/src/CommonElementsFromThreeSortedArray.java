/**
 * 25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class CommonElementsFromThreeSortedArray {

	public static void commonElements(int[] arr1, int[] arr2, int[] arr3) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);

		System.out.print("Common Elements: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.print(arr1[i] + " ");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 17, 25, 11, 7 };
		int[] arr2 = { 6, 7, 25, 43, 17 };
		int[] arr3 = { 3, 4, 17, 25, 1, 7, 8, 12 };
		commonElements(arr1, arr2, arr3);
	}
}
