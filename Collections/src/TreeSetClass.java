/**
 * Write java programs showing following functionalities using a TreeSet
 * 
 * @author Chandni
 *
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>(); // treeset of integers

		// adding elements
		treeSet.add(7);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(11);
		treeSet.add(53);
		treeSet.add(6);
		treeSet.add(49);
		System.out.println(treeSet);

		/**
		 * to iterate through all elements in a tree set
		 */

		// iterate through all elements
		System.out.println("\n" + "TreeSet: ");
		for (Integer iter : treeSet) {
			System.out.println(iter);
		}

		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(); // treeset of integers

		// adding elements
		treeSet1.add(77);
		treeSet1.add(11);
		treeSet1.add(33);
		treeSet1.add(88);
		treeSet1.add(66);
		treeSet1.add(99);
		treeSet1.add(55);
		System.out.println("\n" + "TreeSet 1: " + treeSet1);

		TreeSet<Integer> treeSet2 = new TreeSet<Integer>(); // treeset of integers

		// adding elements
		treeSet2.add(4);
		treeSet2.add(97);
		treeSet2.add(57);
		treeSet2.add(127);
		treeSet2.add(16);
		treeSet2.add(7);
		treeSet2.add(64);
		System.out.println("TreeSet 2: " + treeSet2);

		/**
		 * to add all the elements of a specified tree set to another tree set
		 */

		treeSet1.addAll(treeSet2); // add all elements of a specified tree set to another tree set
		System.out.println("Combo : " + treeSet1);

		/**
		 * to create a reverse order view of the elements contained in a given tree set
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);
		Iterator reverse = treeSet.descendingIterator(); // reverse order
		System.out.println("Reverse Order: ");
		while (reverse.hasNext()) {
			System.out.println(reverse.next());
		}

		/**
		 * to get the first and last elements in a tree set
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);
		Object first = treeSet.first(); // get first element
		System.out.println("First Element: " + first);
		Object last = treeSet.last(); // get last element
		System.out.println("Last Element: " + last);

		/**
		 * to get the number of elements in a tree set
		 */

		System.out.println("\n" + "No. of elements in TreeSet: " + treeSet.size()); // size

		/**
		 * to find the numbers less than 7 in a tree set
		 */

		TreeSet<Integer> treeSet7 = new TreeSet<Integer>();
		treeSet7 = (TreeSet) treeSet.headSet(7); // numbers less than 7
		Iterator it = treeSet7.iterator();
		System.out.println("\n" + "Nos. less than 7: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/**
		 * to get the element in a tree set which is greater than or equal to the given
		 * element
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);

		System.out.println("Greater than or equal to 43: " + treeSet.ceiling(43)); // greater than or equal to
		System.out.println("Greater than or equal to 11: " + treeSet.ceiling(11));

		/**
		 * to retrieve and remove the first element of a tree set
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);
		System.out.println("Remove the first Element: " + treeSet.pollFirst()); // remove first element
		System.out.println("Treeset After Removal of First Element: " + treeSet);

		/**
		 * to retrieve and remove the last element of a tree set
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);
		System.out.println("Remove the last Element: " + treeSet.pollLast()); // remove last element
		System.out.println("Treeset After Removal of Last Element: " + treeSet);

		/**
		 * to remove a given element from a tree set
		 */

		System.out.println("\n" + "Original TreeSet: " + treeSet);
		System.out.println("Remove an Element: " + treeSet.remove(6)); // remove specified element
		System.out.println("Treeset After Removal of specified Element: " + treeSet);

	}

}
