/**
 * 33. Write a Java program to remove the duplicate elements of a given array and return the new length of the array. 
 * Sample array: [20, 20, 30, 40, 50, 50, 50] 
 * After removing the duplicate elements the program should return 4 as the new length of the array.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays; 

public class Q33 {
	
	public static int newLength(int[] arr) {
        int index = 1;
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] != arr[index-1])
        	   arr[index++] = arr[i];
       }
	  return index;
   }
	
	public static void main(String[] args) {

		int[] arr = { 20, 20, 30, 40, 50, 50, 50 };

		System.out.println("Integer Values: " + Arrays.toString(arr));
		
		System.out.println("Array Length: " + arr.length);
		System.out.println("Array Length after duplicate removal: " + newLength(arr));
	}

}
