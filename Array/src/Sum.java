/**
 * 2. Write a Java program to sum values of an array.
 * 
 * @author Chandni
 */

public class Sum {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum = " + sum);

	}
}
