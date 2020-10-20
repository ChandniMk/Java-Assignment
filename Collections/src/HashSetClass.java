/**
 * Write java programs showing following functionalities using a HashSet
 * 
 * @author Chandni
 * 
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<String> students = new HashSet<String>(); // creating hashset

		// adding objects in hashset
		students.add("Jake");
		students.add("Amy");
		students.add("Rosa");
		students.add("Holt");
		students.add("Charles");
		students.add("Terry");
		students.add("Gina");

		/**
		 * to append the specified element to the end of a hash set
		 */

		System.out.println("Students: " + students);

		/**
		 * to iterate through all elements in a hash list
		 */

		System.out.println("\n" + "Students: ");
		Iterator<String> iter = students.iterator(); // iterate through all elements
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		/**
		 * to get the number of elements in a hash set
		 */

		System.out.println("\n" + "No. of Students: " + students.size()); // no. of elements

		/**
		 * to empty an hash set
		 */

		students.removeAll(students);
		System.out.println("\n" + "Removed all Students: " + students);

		HashSet<String> names = new HashSet<String>(); // creating hashset

		names.add("Jake");
		names.add("Amy");
		names.add("Rosa");
		names.add("Holt");
		names.add("Charles");
		names.add("Terry");
		names.add("Gina");

		/**
		 * to convert a hash set to an array
		 */

		String[] arr = new String[names.size()]; // covert hashset to array
		names.toArray(arr);
		System.out.println("\n" + "Array Elements: ");
		for (String a : arr) {
			System.out.println(a);
		}

		/**
		 * to convert a hash set to a ArrayList
		 */

		List<String> list = new ArrayList<String>(names); // convert hashset to arraylist
		System.out.println("\n" + "ArrayList Elements: " + list);

		HashSet<String> hashSet1 = new HashSet<String>(); // creating HashSet 1
		// adding objects in HashSet 1
		hashSet1.add("Jake");
		hashSet1.add("Amy");
		hashSet1.add("Rosa");
		hashSet1.add("Holt");
		hashSet1.add("Charles");
		hashSet1.add("Terry");
		hashSet1.add("Demon");
		System.out.println("\n" + "Hash Set 1: " + hashSet1);

		HashSet<String> hashSet2 = new HashSet<String>(); // creating HashSet 2
		// adding objects in HashSet 2
		hashSet2.add("Holt");
		hashSet2.add("Elena");
		hashSet2.add("Bonnie");
		hashSet2.add("Klaus");
		hashSet2.add("Terry");
		hashSet2.add("Demon");
		hashSet2.add("Amy");
		System.out.println("Hash Set 2: " + hashSet2);

		/**
		 * to convert a hash set to a List/ArrayList
		 */

		HashSet<String> h = new HashSet<String>();
		for (String hs : hashSet1) {
			System.out.println(hashSet2.contains(hs) ? "Yes" : "No"); // compare two hash sets
		}

		/**
		 * to compare two sets and retain elements which are same on both sets
		 */

		System.out.println("\n" + "Hash Set 1: " + hashSet1);
		System.out.println("Hash Set 2: " + hashSet2);
		hashSet1.retainAll(hashSet2); // retain common elements
		System.out.println("\n" + "Common: " + hashSet1);

		/**
		 * to remove all of the elements from a hash set
		 */

		hashSet1.clear(); // remove all elements
		System.out.println("\n" + "All elements Removed from Hash Set: " + hashSet1);

	}

}
