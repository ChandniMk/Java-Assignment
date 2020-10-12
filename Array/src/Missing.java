/**
 * 24. Write a Java program to find a missing number in an array.
 * 
 * @author Chandni
 *
 */
public class Missing {

	public static void main(String[] args) {

		//int[] arr = { 1, 2, 2, 3, 3, 3, 5, 7, 7, 9 };
		int[] arr = {6, 1, 7, 7, 5, 3, 3, 3};
	

		int[] newArr = new int[arr.length];

		for (int i : arr) {
			newArr[i] = 1;
		}

		System.out.print("Missing Numbers: ");

		for (int i = 1; i < newArr.length; i++) {
			if (newArr[i] == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
