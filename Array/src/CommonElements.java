/**
 * 14. Write a Java program to find the common elements between two arrays (string values).  
 * 
 * 15. Write a Java program to find the common elements between two arrays of integers.
 * 
 * @author Chandni
 *
 */

public class CommonElements {

	public static void main(String[] args) {

		int[] arr1 = { 8, 5, 4, 1, 6 };
		int[] arr2 = { 8, 5, 3, 11, 6, 7, 1 };
		
		System.out.print("arr1: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\narr2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.print("\nCommon Elements: ");		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
		
		String[] s1 = { "Jake", "Rosa", "Amy", "Terry", "Charles"};
		String[] s2 = { "Jake", "Amy", "Holt", "Charles", "Gina"};
		
		System.out.print("\n\ns1: ");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.print("\ns2: ");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + " ");
		}
		System.out.print("\nCommon Elements: ");		
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					System.out.print(s1[i] + " ");
				}
			}
		}
	}

}
