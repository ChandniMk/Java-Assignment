/**
 * Write java programs showing following functionalities using a TreeMap
 * 
 * @author Chandni
 *
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(5, "Jake");
		treeMap.put(4, "Holt");
		treeMap.put(6, "Rosa");
		treeMap.put(7, "Terry");
		treeMap.put(1, "Amy");
		treeMap.put(3, "Gina");
		treeMap.put(2, "Charles");

		System.out.println(treeMap + "\n");

		/**
		 * to get all keys from the given a Tree Map
		 */

		Set<Integer> keys = treeMap.keySet(); // get all keys from the treemap
		for (Integer k : keys) {
			System.out.println("Keys: " + k);
		}

		/**
		 * to get the first (lowest) key and the last (highest) key currently in a map
		 */

		System.out.println("\nOriginal TreeMap: " + treeMap);
		System.out.println("Highest Key: " + treeMap.firstKey()); // first lowest key
		System.out.println("Lowest Key: " + treeMap.lastKey()); // last highest key

		/**
		 * to get a reverse order view of the keys contained in a given map
		 */

		System.out.println("\nOriginal TreeMap: " + treeMap);
		System.out.println("Reverse TreeMap: " + treeMap.descendingKeySet()); // reverse order view of the key

		/**
		 * to delete all elements from a given Tree Map
		 */

		treeMap.clear();
		System.out.println("\nAll Clear: " + treeMap);

		/**
		 * to sort keys in Tree Map by using comparator
		 */

		TreeMap<String, String> treeMap1 = new TreeMap<String, String>(new sort_key());

		treeMap1.put("E", "Jake");
		treeMap1.put("D", "Holt");
		treeMap1.put("F", "Rosa");
		treeMap1.put("G", "Terry");
		treeMap1.put("A", "Amy");
		treeMap1.put("C", "Gina");
		treeMap1.put("B", "Charles");

		System.out.println("\nComparator output: " + treeMap1);
	}
}

class sort_key implements Comparator<String> {
	@Override
	public int compare(String string1, String string2) {
		return string1.compareTo(string2);
	}

}
