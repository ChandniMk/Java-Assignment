/**
 * 4. Write a Java program to calculate the average value of array elements.
 * 
 * @author Chandni
 */

public class Average {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 3, 1, 6 };
		float avg = 0;
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		avg = sum / arr.length;
		System.out.println("Average: " + avg);
	}

}
