/**
 * 26. Java program to move all 0's to the end of an array. Maintain the
 * relative order of the other (non-zero) array elements.
 * 
 * @author Chandni
 *
 */
public class MoveZeros {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0, 2, 0, 5, 0, 4 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		while (count < arr.length) {
			arr[count++] = 0;
		}

		System.out.print("Zero moved to end: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
