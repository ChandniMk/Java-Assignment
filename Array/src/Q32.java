/**
 * 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77.
 * 
 * @author Chandni
 *
 */
import java.util.Arrays;

public class Q32 {

	public static boolean contains(int[] arr) {
		
		boolean num1 = false;
		boolean num2 = false;
		
		for (int arr1 : arr) {
			if (arr1 == 65) {
			num1 = true;
			}
		}
		for (int arr1 : arr) {
			if (arr1 == 77) {
			num2 = true;
			}
		}
		if(num1 && num2) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 65, 77 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Contains 65 and 77? : " + contains(arr));
		
		int[] arr1 = { 8, 5, 3, 6, 77 };
		System.out.println("\nArray: " + Arrays.toString(arr1));
		System.out.println("Contains 65 and 77? : " + contains(arr1));
		
		int[] arr2 = { 8, 5, 3, 65, 7 };
		System.out.println("\nArray: " + Arrays.toString(arr2));
		System.out.println("Contains 65 and 77? : " + contains(arr2));
		
		int[] arr3 = { 8, 5, 3, 6, 7 };
		System.out.println("\nArray: " + Arrays.toString(arr3));
		System.out.println("Contains 65 and 77? : " + contains(arr3));
		
		int[] arr4 = { 8, 5, 3, 77, 65 };
		System.out.println("\nArray: " + Arrays.toString(arr4));
		System.out.println("Contains 65 and 77? : " + contains(arr4));
		
	}
	
}
