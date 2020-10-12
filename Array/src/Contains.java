/**
 * 5. Write a Java program to test if an array contains a specific value.
 * 
 * @author Chandni
 */

public class Contains {

	public static boolean contains(int[] arr, int test) {

		for (int n : arr) {
			if (test == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		System.out.println(contains(arr, 7));
		System.out.println(contains(arr, 5));
	}

}
