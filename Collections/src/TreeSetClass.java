import java.util.*;
public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>(); // treeset of integers
		
		// adding elements
		t.add(7); 
		t.add(4); 
		t.add(1); 
		t.add(11); 
		t.add(53); 
		t.add(6); 
		t.add(49); 
		System.out.println(t);
		
		// iterate through all elements
		System.out.println("\n" + "TreeSet: "); 
		for(Integer iter : t) {
			System.out.println(iter);
		}
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(); // treeset of integers
		
		// adding elements
		t1.add(77); 
		t1.add(11); 
		t1.add(33); 
		t1.add(88); 
		t1.add(66); 
		t1.add(99); 
		t1.add(55); 
		System.out.println("\n" + "TreeSet 1: " + t1);
		
		TreeSet<Integer> t2 = new TreeSet<Integer>(); // treeset of integers
		
		// adding elements
		t2.add(4); 
		t2.add(97); 
		t2.add(57); 
		t2.add(127); 
		t2.add(16); 
		t2.add(7); 
		t2.add(64); 
		System.out.println("TreeSet 2: " + t2);
		
		t1.addAll(t2); // add all elements of a specified tree set to another tree set
		System.out.println("Combo : " + t1); 
		
		System.out.println("\n" + "Original TreeSet: " + t);
		Iterator d = t.descendingIterator(); // reverse order
		System.out.println("Reverse Order: ");
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		
		System.out.println("\n" + "Original TreeSet: " + t);
		Object f = t.first(); // get first element
		System.out.println("First Element: " + f);
		Object l = t.last(); // get last element
		System.out.println("Last Element: " + l);
		
		System.out.println("\n" + "No. of elements in TreeSet: " + t.size()); // size
		
		TreeSet <Integer> t7 = new TreeSet<Integer>();
		t7 = (TreeSet)t.headSet(7); // numbers less than 7
		Iterator it = t7.iterator();
		System.out.println("\n" + "Nos. less than 7: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n" + "Original TreeSet: " + t);
		
		System.out.println("Greater than or equal to 43: " + t.ceiling(43)); // greater than or equal to
		System.out.println("Greater than or equal to 11: " + t.ceiling(11));
		
		System.out.println("\n" + "Original TreeSet: " + t); 
		System.out.println("Remove the first Element: " + t.pollFirst()); // remove first element
		System.out.println("Treeset After Removal of First Element: " + t);
		
		System.out.println("\n" + "Original TreeSet: " + t);
		System.out.println("Remove the last Element: " + t.pollLast()); // remove last element
		System.out.println("Treeset After Removal of Last Element: " + t);
		
		System.out.println("\n" + "Original TreeSet: " + t);
		System.out.println("Remove an Element: " + t.remove(6)); // remove specified element
		System.out.println("Treeset After Removal of specified Element: " + t);


	}

}
