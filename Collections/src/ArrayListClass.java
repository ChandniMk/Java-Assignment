import java.lang.reflect.Array;
import java.util.*;


public class ArrayListClass{
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<String>(); // creating arraylist
		
		// adding objects in arraylist
		students.add("Jake");
		students.add("Amy");
		students.add("Rosa");
		students.add("Holt");
		students.add("Charles");
		students.add("Terry");
		students.add("Gina");
		
		// iterate through all the elements in an arraylist
		System.out.println("Students: ");
		Iterator iter = students.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\n" + "Insert Diaz at the first position: ");
		students.add(0, "Diaz"); // insert an element into the arraylist at the first position
		for(int i = 0; i < students.size(); i++) { 
			System.out.println(students.get(i)); 
			}
		
		System.out.println("\n" + "Retrieve an element at a specified index from a given arraylist: ");
		String name = students.get(0); // retrieve an element at a specified index from a given arraylist
		System.out.println(name + "\n"); 
			
		System.out.println("Update specific array element by given element: ");
		students.set(7,"Damon"); // update specific array element by given element
		for(int i = 0; i < students.size(); i++) { 
			System.out.println(students.get(i)); 
			}
		
		System.out.println("\n" +"Remove third element from an array list: ");
		students.remove(2); // remove third element from an array list
		for(int i = 0; i < students.size(); i++) { 
			System.out.println(students.get(i)); 
			}
		
		System.out.println("\n" +"Search an element in an arraylist");
		boolean search = students.contains("Jake"); // search an element in an arraylist 
		if(search) 
			System.out.println("Found" + "\n");
		else 
			System.out.println("Not in the aray" + "\n");
		
		System.out.println("Sort a given array list: ");
		Collections.sort(students); // sort a given array list
		System.out.println(students + "\n");
		
		ArrayList<String> arr = new ArrayList<String>(); // creating arraylist
		
		// adding objects in arraylist
				students.add("Stefen");
				students.add("Elena");
				students.add("Bonnie");
				students.add("Klaus");
				students.add("Caroline");
				students.add("Tyler");
				students.add("Zach");
				
				System.out.println("Copy one array list into another: ");
				Collections.copy(students,arr); // copy one array list into another
				System.out.println(students + "\n");
				
				System.out.println("Reverse elements in a arraylist: ");
				Collections.reverse(students); // reverse elements in a arraylist
				System.out.println(students + "\n");
				
				students.addAll(arr); // join two arraylist
				System.out.println("Join two arraylist: " + students + "\n");
				
				ArrayList<String> c = (ArrayList<String>)students.clone(); // clone an arraylist to another arraylist
				System.out.println("Cloned arraylist: " + c + "\n");
				
				c.removeAll(c); // remove an arraylist
				System.out.println("Removed Cloned arraylist: " + c + "\n");
				
				boolean e = c.isEmpty();
				if(e == true)
					System.out.println("The arraylist is Empty");
				else 
					System.out.println("The arraylist is not Empty");
	}
} 







