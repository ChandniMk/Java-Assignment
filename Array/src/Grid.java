/**
 * 3. Write a Java program to print the following grid.
 * 
 * Expected Output : 
 * - - - - - - - - -
 * - - - - - - - - - 
 * - - - - - - - - - 
 * - - - - - - - - - 
 * - - - - - - - - - 
 * - - - - - - - - -
 * 
 * @author Chandni
 */

public class Grid {

	public static void main(String[] args) {

		String[][] grid = new String[6][9];

		System.out.println("Grid: ");
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 9; column++) {
				grid[row][column] = "- ";
				System.out.print(grid[row][column]);
			}
			System.out.println();
		}
	}

}
