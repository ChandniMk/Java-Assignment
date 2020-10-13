import java.util.*;

public class TreeMapClass {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(5, "Jake");
		tm.put(4, "Holt");
		tm.put(6, "Rosa");
		tm.put(7, "Terry");
		tm.put(1, "Amy");
		tm.put(3, "Gina");
		tm.put(2, "Charles");
		
		System.out.println(tm + "\n");
		
		Set<Integer> keys = tm.keySet(); // get all keys from the treemap
		for(Integer k: keys) {
			System.out.println("Keys: " + k);
		}
		
		System.out.println("\nOriginal TreeMap: " + tm);
		System.out.println("Highest Key: " + tm.firstKey()); // first lowest key
		System.out.println("Lowest Key: " + tm.lastKey()); // last highest key
		
		System.out.println("\nOriginal TreeMap: " + tm);
		System.out.println("Reverse TreeMap: " + tm.descendingKeySet()); // reverse order view of the key
		
		tm.clear();
		System.out.println("\nAll Clear: " + tm);
		
		TreeMap<String,String> T = new TreeMap<String,String>(new sort_key());
		
		T.put("E", "Jake");
		T.put("D", "Holt");
		T.put("F", "Rosa");
		T.put("G", "Terry");
		T.put("A", "Amy");
		T.put("C", "Gina");
		T.put("B", "Charles");
		
		System.out.println("\nComparator output: " + T);	
		}
}

 class sort_key implements Comparator<String>{	
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}
