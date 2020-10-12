/**
 * 20. Write a Java program to convert an array to ArrayList. 
 * 
 * 21. Write a Java program to convert an ArrayList to an array.
 * 
 * @author Chandni
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Jake");
		list.add("Rosa");
		list.add("Amy");
		list.add("Holt");
		list.add("Gina");

		System.out.print("Converting ArrayList to Array: ");
		String[] array = list.toArray(new String[list.size()]);
		for (String s : array) {
			System.out.print(s + " ");
		}

		System.out.print("\nConverting Array to ArrayList: ");
		List<String> arrayList = new ArrayList<>();
		arrayList = Arrays.asList(array);
		System.out.print(arrayList);
	}

}
