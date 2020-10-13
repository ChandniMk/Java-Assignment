import java.util.*;

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

		System.out.println("Students: " + students); 
		
		System.out.println("\n" + "Students: ");
		Iterator<String> iter = students.iterator(); // iterate through all elements
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\n" + "No. of Students: " + students.size()); // no. of elements
		
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
		
	
		String[] arr = new String[names.size()]; // covert hashset to array 
		names.toArray(arr);
		System.out.println("\n" + "Array Elements: ");
		for(String a : arr) {
			System.out.println(a);
		}
		
		List<String> list = new ArrayList<String>(names); // convert hashset to list/arraylist
		System.out.println("\n" + "ArrayList Elements: " + list);
		
		HashSet<String> h1 = new HashSet<String>(); // creating HashSet 1
		// adding objects in HashSet 1
		h1.add("Jake");
		h1.add("Amy");
		h1.add("Rosa");
		h1.add("Holt");
		h1.add("Charles");
		h1.add("Terry");
		h1.add("Demon");
		System.out.println("\n" + "Hash Set 1: " + h1);
		
		HashSet<String> h2 = new HashSet<String>(); // creating HashSet 2
		// adding objects in HashSet 2
		h2.add("Holt");
		h2.add("Elena");
		h2.add("Bonnie");
		h2.add("Klaus");
		h2.add("Terry");
		h2.add("Demon");
		h2.add("Amy");
		System.out.println("Hash Set 2: " + h2);
		
		HashSet<String> h = new HashSet<String>();
		for (String ha : h1) {
			System.out.println(h2.contains(ha) ? "Yes" : "No"); // compare two hash sets
		}
		
		System.out.println("\n" + "Hash Set 1: " + h1);
		System.out.println("Hash Set 2: " + h2);
		h1.retainAll(h2); // retain common elements
		System.out.println("\n" + "Common: " + h1);
		
		h1.clear(); // remove all elements
		System.out.println("\n" + "All elements Removed from Hash Set: " + h1);
		
	}

}
