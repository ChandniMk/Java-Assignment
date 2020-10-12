/**
 * 19. Write a Java program to add two matrices of the same size.
 * 
 * @author Chandni
 *
 */
public class MatrixAddition {

	public static void main(String[] args) {

		int a[][] = { { 2, 7, 6 }, { 5, 8, 9 }, { 1, 4, 3 } };
		int b[][] = { { 6, 5, 4 }, { 9, 1, 7 }, { 3, 2, 8 } };
		int sum[][] = new int[3][3];

		System.out.println("a: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nb: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] +  "\t");
			}
			System.out.println();
		}

		System.out.println("\nsum: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] +  "\t");
			}
			System.out.println();
		}

	}

}
