/**
 * 12. Write a Java program to find the duplicate values of an array of integer values. 
 * 
 * 13. Write a Java program to find the duplicate values of an array of string values.
 * 
 * @author Chandni
 */
public class Duplicate {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 5, 3, 5, 1, 8, 6, 7 };

		System.out.print("Integer Values: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nDuplicate Values: ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.print(arr[j] + " ");
				}
			}
		}

		String[] s = { "Jake", "Terry", "Rosa", "Amy", "Holt", "Rosa", "Charles", "Terry", "Gina" };

		System.out.print("\n\nString Values: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

		System.out.print("\nDuplicate Values: ");
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((s[i] == s[j]) && (i != j)) {
					System.out.print(s[j] + " ");
				}
			}
		}

	}

}
