/**
 * Write java programs showing following functionalities using an ArrayList.
 * 
 * @author Chandni
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<String>(); // creating integer arraylist

		// adding objects in arraylist
		students.add("Jake");
		students.add("Amy");
		students.add("Rosa");
		students.add("Holt");
		students.add("Charles");
		students.add("Terry");
		students.add("Gina");

		/**
		 * to iterate through all the elements in an arraylist
		 */
		
		System.out.println("Students: ");
		Iterator<String> iter = students.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		/**
		 * to insert an element into the arraylist at the first position
		 */

		System.out.println("\n" + "Insert Diaz at the first position: ");
		students.add(0, "Diaz");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		/**
		 * to retrieve an element at a specified index from a given arraylist
		 */

		System.out.println("\n" + "Retrieve an element at a specified index from a given arraylist: ");
		String name = students.get(0);
		System.out.println(name + "\n");

		/**
		 * to update specific array element by given element
		 */

		System.out.println("Update specific array element by given element: ");
		students.set(7, "Damon");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		/**
		 * to remove third element from an array list
		 */

		System.out.println("\n" + "Remove third element from an array list: ");
		students.remove(2);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		/**
		 * to search an element in an arraylist
		 */

		System.out.println("\n" + "Search an element in an arraylist");
		boolean searchElement = students.contains("Jake");
		if (searchElement) {
			System.out.println("Found" + "\n");
		} else {
			System.out.println("Not in the aray" + "\n");
		}

		/**
		 * to sort a given array list
		 */

		System.out.println("Sort a given array list: ");
		Collections.sort(students); // sort a given array list
		System.out.println(students + "\n");

		ArrayList<String> arr = new ArrayList<String>(); // creating string arraylist

		// adding objects in arraylist
		students.add("Stefen");
		students.add("Elena");
		students.add("Bonnie");
		students.add("Klaus");
		students.add("Caroline");
		students.add("Tyler");
		students.add("Zach");

		/**
		 * to copy one array list into another
		 */

		System.out.println("Copy one array list into another: ");
		Collections.copy(students, arr);
		System.out.println(students + "\n");

		/**
		 * to reverse elements in a arraylist
		 */

		System.out.println("Reverse elements in a arraylist: ");
		Collections.reverse(students);
		System.out.println(students + "\n");

		/**
		 * to join two arraylist
		 */

		students.addAll(arr);
		System.out.println("Join two arraylist: " + students + "\n");

		/**
		 * to clone an arraylist to another arraylist
		 */

		ArrayList<String> cloneList = (ArrayList<String>) students.clone();
		System.out.println("Cloned arraylist: " + cloneList + "\n");

		/**
		 * to empty an arraylist
		 */

		cloneList.removeAll(cloneList);
		System.out.println("Removed Cloned arraylist: " + cloneList + "\n");

		/**
		 * to test an array list is empty or not
		 */

		boolean checkEmpty = cloneList.isEmpty();
		if (checkEmpty == true) {
			System.out.println("The arraylist is Empty");
		} else {
			System.out.println("The arraylist is not Empty");
		}
	}
}
