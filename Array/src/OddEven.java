/**
 * 27. Write a Java program to find the number of even and odd integers in a given array of integers.
 * 
 * @author Chandni
 *
 */
import java.util.Arrays;

public class OddEven {

	public static void main(String[] args)
	 {
		int[] arr = { 8, 5, 3, 1, 6 };
		int count = 0;
		
		System.out.println("Array: " + Arrays.toString(arr)); 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				count++;
		}
		System.out.println("Number of even integers: " + count);
		System.out.println("Number of odd integers: " + (arr.length - count));
	 }
}
