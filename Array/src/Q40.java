/**
 * 40. Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
 * 
 * @author Chandni
 *
 */
import java.util.Arrays;

public class Q40 {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 1, 6 };
		
		System.out.println("Before Seperation: " + Arrays.toString(arr));
		
		System.out.print("After Seperation: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
