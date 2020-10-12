/**
 * 1. Write a Java program to sort a numeric array and a string array.
 *  sort --> ascending and descending
 * 
 * @author Chandni
 */

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };

		System.out.print("Numeric Array Before Sorting: ");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.print("Numeric Array After Sorting (ascending): ");
		System.out.println(Arrays.toString(arr));

		System.out.print("Numeric Array After Sorting (descending): ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		String[] s = { "Jake", "Rosa", "Amy", "Holt", "Charles", "Terry", "Gina" };

		System.out.print("\n\nString Array Before Sorting: ");
		System.out.println(Arrays.toString(s));

		Arrays.sort(s);
		System.out.print("String Array After Sorting: ");
		System.out.println(Arrays.toString(s));

		System.out.print("String Array After Sorting (descending): ");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}

	}
}
