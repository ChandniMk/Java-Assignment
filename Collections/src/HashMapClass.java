import java.util.*;

public class HashMapClass {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(5, "Jake");
		hm.put(4, "Holt");
		hm.put(6, "Rosa");
		hm.put(7, "Terry");
		hm.put(1, "Amy");
		hm.put(3, "Gina");
		hm.put(2, "Charles");
		
		System.out.println(hm);

		Set v = hm.entrySet(); // getting a set of key-value pairs
		Iterator iter = v.iterator(); // obtain an iterator for the entry set
		System.out.println("HashMap Key-Value Pairs: ");
		while(iter.hasNext()) {
			Map.Entry m = (Map.Entry)iter.next();
			System.out.println("The Student ID is: " + m.getKey() + " &" + " Name is: " + m.getValue());
		}
		
		String k = (String)hm.get(7); // get specified key and value
		System.out.println("\n" + "The value of the specified key: " + k);
		
		System.out.println("\n" + "Size: " + hm.size()); // size
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "Monica");
		hm1.put(4, "Phoebe");
		hm1.put(5, "Rachel");
		System.out.println("\n" + "HashMap1: " + hm1);
		
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(2, "Chandler");
		hm2.put(3, "Joey");
		hm2.put(6, "Ross");
		System.out.println("HashMap2: " + hm2);
		
		hm1.putAll(hm2); // copy all of the  mapping from the specified map to another map
		System.out.println("Combo: " + hm1);
		
		hm2.clear();
		System.out.println("\n" + "All Mapping Removed: " + hm2);
		
		System.out.println("\n" + "HashMap: " + hm1);
		if (hm1.containsKey(3)) { //contains specified key 
			System.out.println("Yes " + hm1.get(3));
		}
		else {
			System.out.println("No"); 
		}
		
		System.out.println("\n" + "HashMap: " + hm1);
		if (hm1.containsValue("Ben")) { //contains specified value
			System.out.println("Yes");
		}
		else {
			System.out.println("No"); 
		}
		
		System.out.println("\n" + "HashMap: " + hm1);
		String K = (String)hm1.get(1); // get the value of specified key
		System.out.println("Value of the specified key: " + K);
		
		Set ks = hm1.keySet(); // get a set view of the  keys contained in the map
		System.out.println("\n" + "Key set values: " + ks);
		
		System.out.println("\n" + "Collection view of the values " + hm1.values()); // collection view of values
		
	}

}
