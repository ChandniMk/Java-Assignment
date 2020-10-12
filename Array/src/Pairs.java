/**
 * 22. Write a Java program to find all pairs of elements in an array whose sum
 * is equal to a specified number.
 * 
 * @author Chandni
 *
 */
public class Pairs {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6, 2};
		int num = 7;
		
		System.out.print("Pairs whose sum is " + num + ": " );
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
				}
			}
		}

	}

}
