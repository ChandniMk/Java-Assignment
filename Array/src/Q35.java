/**
 * 35. Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
 * 
 * @author Chandni
 *
 */

public class Q35 {
	
	public static void main(String[] args) {
		
		int[] arr = { 8, -5, 3, -1, 6 };
		
		int sum = arr[0]+arr[1];
		int i1 = 0;
		int i2 = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp = arr[i] + arr[j];
				if(Math.abs(temp) < Math.abs(sum))
				{
					i1 = i;
					i2 = j;
					sum = temp;
				}
			}
		}
		System.out.print("Sum close to zero: (" + arr[i1] + ", "  + arr[i2] + ") and sum is: " + sum);
	}

}
