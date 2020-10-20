/**
 * Write java programs showing following functionalities using a HashMap
 * 
 * @author Chandni
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(5, "Jake");
		hashMap.put(4, "Holt");
		hashMap.put(6, "Rosa");
		hashMap.put(7, "Terry");
		hashMap.put(1, "Amy");
		hashMap.put(3, "Gina");
		hashMap.put(2, "Charles");
		
		System.out.println(hashMap);
		
		/**
		 * to iterate over all the entries in the HashMap
		 */

		Set keyValuePair = hashMap.entrySet(); // getting a set of key-value pairs
		Iterator iter = keyValuePair.iterator(); // obtain an iterator for the entry set
		System.out.println("HashMap Key-Value Pairs: ");
		while(iter.hasNext()) {
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println("The Student ID is: " + map.getKey() + " &" + " Name is: " + map.getValue());
		}
		
		/**
		 * to get the specified value with the specified key in a HashMap
		 */
		
		String key = (String)hashMap.get(7); // get specified key and value
		System.out.println("\n" + "The value of the specified key: " + key);
		
		/**
		 * to count the number of key-value (size) mappings in a map
		 */
		
		System.out.println("\n" + "Size: " + hashMap.size()); // size
		
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.put(1, "Monica");
		hashMap1.put(4, "Phoebe");
		hashMap1.put(5, "Rachel");
		System.out.println("\n" + "HashMap1: " + hashMap1);
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(2, "Chandler");
		hashMap2.put(3, "Joey");
		hashMap2.put(6, "Ross");
		System.out.println("HashMap2: " + hashMap2);
		
		/**
		 * to copy all of the mappings from the specified map to another map
		 */
		
		hashMap1.putAll(hashMap2); // copy all of the  mapping from the specified map to another map
		System.out.println("Combo: " + hashMap1);
		
		/**
		 * to remove all of the mappings from a map
		 */
		
		hashMap2.clear();
		System.out.println("\n" + "All Mapping Removed: " + hashMap2);
		
		/**
		 * to test if a map contains a mapping for the specified key
		 */
		
		System.out.println("\n" + "HashMap: " + hashMap1);
		if (hashMap1.containsKey(3)) { //contains specified key 
			System.out.println("Yes " + hashMap1.get(3));
		}
		else {
			System.out.println("No"); 
		}
		
		/**
		 * to test if a map contains a mapping for the specified value
		 */
		
		System.out.println("\n" + "HashMap: " + hashMap1);
		if (hashMap1.containsValue("Ben")) { //contains specified value
			System.out.println("Yes");
		}
		else {
			System.out.println("No"); 
		}
		
		/**
		 * to get the value of a specified key in a map
		 */
		
		System.out.println("\n" + "HashMap: " + hashMap1);
		String key1 = (String)hashMap1.get(1); // get the value of specified key
		System.out.println("Value of the specified key: " + key1);
		
		/**
		 * to get a set view of the keys contained in this map
		 */
		
		Set keyValue = hashMap1.keySet(); // get a set view of the  keys contained in the map
		System.out.println("\n" + "Key set values: " + keyValue);
		
		/**
		 * to get a collection view of the values contained in this map
		 */
		
		System.out.println("\n" + "Collection view of the values " + hashMap1.values()); // collection view of values
		
	}

}
