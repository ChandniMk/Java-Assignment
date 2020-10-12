/**
 * 11. Write a Java program to reverse an array of integer values.
 * 
 * @author Chandni
 */

public class Reverse {

	public static void main(String[] args) {
		
		int[] arr = { 8, 5, 3, 1, 6 };
		System.out.print("Before: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nAfter: "); 
		for(int i = arr.length-1; i >= 0; i--) {  
			 System.out.print(arr[i] + " "); 
	     }
	}

}
