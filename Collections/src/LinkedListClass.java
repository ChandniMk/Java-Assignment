import java.util.*;

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
				
				System.out.println("Append specified Element at the end of the Linked List: ");
				System.out.println(names);
				
				// iterate through all the elements in an linkedlist
				System.out.println("\n" + "Names: ");
				for(String n : names) { 
				System.out.println(n); // print the linkedlist objects
				}
				
				System.out.println("\n" + "Iterate through all elements in a linked list starting at the specified position: ");
				Iterator l = names.listIterator(2); //iterate through all elements in a linkedlist starting at the specified position
				while (l.hasNext()) {
					System.out.println(l.next());
				}
				
				System.out.println("\n" + "Iterate a Linked List in reverse order: ");
				Iterator<String> r = names.descendingIterator(); // iterate a linkedlist in reverse order
				while(r.hasNext()) {
					System.out.println(r.next());
				}
				
				names.add(3, "Diaz"); // insert the specified element at the specified position in the linkedlist
				System.out.println("\n" + "Insert the specified element at the specified position: ");
				Iterator n = names.iterator();
				while(n.hasNext()) {
					System.out.println(n.next());
				}
				
				System.out.println("\n" + "Names: " + names);
				System.out.println("Insert specified Element at the front of the Linked List: ");
				names.addFirst("Damon"); // insert specified element at the front of the linkedlist
				System.out.println(names);
				
				System.out.println("\n" + "Names: " + names);
				System.out.println("Insert specified Element at the end of the Linked List: ");
				names.addLast("Diaz"); // insert specified element at the end of the linkedlist
				System.out.println(names+ "\n");
				
				for(int i = 0; i < names.size(); i ++){
					System.out.println("Elements at index " + i + ": " + names.get(i));
				}
				
				System.out.println("\n" + "Names: " + names);
				names.removeFirst(); // remove first element
				names.removeLast(); // remove last element
				System.out.println("\n" + "First and Last Element Removed: " + names);
				
				names.clear(); // remove all elements from linked list
				System.out.println("\n" + "All Elements Removed: " + names);
				
				LinkedList<String> n1 = new LinkedList<String>(); // creating linkedlist 1
				// adding objects in linkedlist 1
				n1.add("Jake");
				n1.add("Amy");
				n1.add("Rosa");
				n1.add("Holt");
				n1.add("Charles");
				n1.add("Terry");
				n1.add("Gina");
				
				System.out.println("\n" + "List 1: ");
				for(int i = 0; i < n1.size(); i++) { 
				System.out.println(n1.get(i)); // print the linkedlist objects
				}
				
				LinkedList<String> n2 = new LinkedList<String>(); // creating linkedlist 2
				// adding objects in linkedlist 2
				n2.add("Stefen");
				n2.add("Elena");
				n2.add("Bonnie");
				n2.add("Klaus");
				n2.add("Caroline");
				n2.add("Tyler");
				n2.add("Zach");
				
				System.out.println("\n" + "List 2: ");
				for(int i = 0; i < n2.size(); i++) { 
				System.out.println(n2.get(i)); // print the linkedlist objects
				}
				
				LinkedList<String> j = new LinkedList<String>(); // creating a joined linkedlist
				j.addAll(n1);
				j.addAll(n2);
				System.out.println("\n" + "Joined Linked List: " + j);
				
				LinkedList<String> c = new LinkedList<String>();  
				c = (LinkedList)n1.clone(); // creating a cloned linkedlist
				System.out.println("\n" + "Clone of List 1: " + c);
				
				System.out.println("\n" + "Before Removal: " + c);
				System.out.println("Removed First Element: " + c.pop()); // remove and return the first element in a linkedlist
				System.out.println("After Removal: " + c);
				
				System.out.println("\n" + "Original Linked List: " + c);
				String re = c.peekFirst(); 
				System.out.println("Retrived First element from the Linked List: " + re);
				System.out.println("After Retrival: " + c);
				
				System.out.println("\n" + "Check if a particular element exists in a linked list: ");
				if (n1.contains("Amy")) {
					System.out.println("Exists");
				}
				else {
					System.out.println(" Does not Exists");
				}
				
				System.out.println("\n" + "Linked List to Array List: ");
				List<String> arr = new ArrayList<String>(n2); // linkedlist to arraylist
				for(String str : arr) {
					System.out.println(str);
				}
				

	}

}
