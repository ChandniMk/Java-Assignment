/**
 * 34. Write a Java program to find the sum of the two elements of a given array
 * which is equal to a given integer. Sample array: [1,2,4,5,6] Target value: 6.
 * 
 * @author Chandni
 *
 */
public class Q34 {	

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		int target = 6;
		System.out.print("Sum of two elements which is equal to " + target + " are: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.print("(" + arr[i] + ", "  + arr[j] + ") ");
				}
			}
		}
		
	}
}
