/**
 * Write java programs showing following functionalities using a LinkedList
 * 
 * @author Chandni
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>(); // creating linkedlist

		// adding objects in linkedlist
		names.add("Jake");
		names.add("Amy");
		names.add("Rosa");
		names.add("Holt");
		names.add("Charles");
		names.add("Terry");
		names.add("Gina");

		/**
		 * to append specified Element at the end of the Linked List
		 */

		System.out.println("Append specified Element at the end of the Linked List: ");
		System.out.println(names);

		/**
		 * to iterate through all the elements in an linkedlist
		 */

		System.out.println("\n" + "Names: ");
		for (String n : names) {
			System.out.println(n); // print the linkedlist objects
		}

		/**
		 * to iterate through all elements in a linkedlist starting at the specified
		 * position
		 */

		System.out.println("\n" + "Iterate through all elements in a linked list starting at the specified position: ");
		Iterator<String> list = names.listIterator(2);
		while (list.hasNext()) {
			System.out.println(list.next());
		}

		/**
		 * to iterate a linkedlist in reverse order
		 */

		System.out.println("\n" + "Iterate a Linked List in reverse order: ");
		Iterator<String> reverse = names.descendingIterator();
		while (reverse.hasNext()) {
			System.out.println(reverse.next());
		}

		/**
		 * to insert the specified element at the specified position in the linkedlist
		 */

		names.add(3, "Diaz");
		System.out.println("\n" + "Insert the specified element at the specified position: ");
		Iterator<String> insertElement = names.iterator();
		while (insertElement.hasNext()) {
			System.out.println(insertElement.next());
		}

		/**
		 * to insert specified element at the front of the linkedlist
		 */

		System.out.println("\n" + "Names: " + names);
		System.out.println("Insert specified Element at the front of the Linked List: ");
		names.addFirst("Damon");
		System.out.println(names);

		/**
		 * to insert specified element at the end of the linkedlist
		 */

		System.out.println("\n" + "Names: " + names);
		System.out.println("Insert specified Element at the end of the Linked List: ");
		names.addLast("Diaz");
		System.out.println(names + "\n");

		for (int i = 0; i < names.size(); i++) {
			System.out.println("Elements at index " + i + ": " + names.get(i));
		}

		/**
		 * to remove first and last element from a linked list
		 */

		System.out.println("\n" + "Names: " + names);
		names.removeFirst(); // remove first element
		names.removeLast(); // remove last element
		System.out.println("\n" + "First and Last Element Removed: " + names);

		/**
		 * to remove all elements from linked list
		 */

		names.clear();
		System.out.println("\n" + "All Elements Removed: " + names);

		LinkedList<String> names1 = new LinkedList<String>(); // creating linkedlist 1
		// adding objects in linkedlist 1
		names1.add("Jake");
		names1.add("Amy");
		names1.add("Rosa");
		names1.add("Holt");
		names1.add("Charles");
		names1.add("Terry");
		names1.add("Gina");

		System.out.println("\n" + "List 1: ");
		for (int i = 0; i < names1.size(); i++) {
			System.out.println(names1.get(i)); // print the linkedlist objects
		}

		LinkedList<String> names2 = new LinkedList<String>(); // creating linkedlist 2
		// adding objects in linkedlist 2
		names2.add("Stefen");
		names2.add("Elena");
		names2.add("Bonnie");
		names2.add("Klaus");
		names2.add("Caroline");
		names2.add("Tyler");
		names2.add("Zach");

		System.out.println("\n" + "List 2: ");
		for (int i = 0; i < names2.size(); i++) {
			System.out.println(names2.get(i)); // print the linkedlist objects
		}

		/**
		 * to join two linked lists
		 */

		LinkedList<String> joiningList = new LinkedList<String>(); // creating a joined linkedlist
		joiningList.addAll(names1);
		joiningList.addAll(names2);
		System.out.println("\n" + "Joined Linked List: " + joiningList);

		/**
		 * to clone an linked list to another linked list
		 */

		LinkedList<String> cloneList = new LinkedList<String>();
		cloneList = (LinkedList) names1.clone(); // creating a cloned linkedlist
		System.out.println("\n" + "Clone of List 1: " + cloneList);

		/**
		 * to remove and return the first element of a linked list
		 */

		System.out.println("\n" + "Before Removal: " + cloneList);
		System.out.println("Removed First Element: " + cloneList.pop()); // remove and return the first element in a
																			// linkedlist
		System.out.println("After Removal: " + cloneList);

		/**
		 * to retrieve but does not remove, the first element of a linked list
		 */

		System.out.println("\n" + "Original Linked List: " + cloneList);
		String retrivedFirstElement = cloneList.peekFirst();
		System.out.println("Retrived First element from the Linked List: " + retrivedFirstElement);
		System.out.println("After Retrival: " + cloneList);

		/**
		 * to check if a particular element exists in a linked list
		 */

		System.out.println("\n" + "Check if a particular element exists in a linked list: ");
		if (names1.contains("Amy")) {
			System.out.println("Exists");
		} else {
			System.out.println(" Does not Exists");
		}

		/**
		 * to convert a linked list to array list
		 */

		System.out.println("\n" + "Linked List to Array List: ");
		List<String> arr = new ArrayList<String>(names2); // linkedlist to arraylist
		for (String str : arr) {
			System.out.println(str);
		}

	}

}
