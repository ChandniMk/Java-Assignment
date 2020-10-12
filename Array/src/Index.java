/**
 * 6. Write a Java program to find the index of an array element.
 * 
 * @author Chandni
 */

public class Index {

	public static int index(int[] arr, int index) {
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == index) {
				return i;	
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = { 8, 5, 3, 1, 6 };
		 System.out.println("Index is: " + index(arr, 3));
	     System.out.println("Index is: " + index(arr, 7));
		

	}

}
