//import java.util
import java.util.*;

public class LinkedLists {
	public static void main (String[] args) {
		LinkedList<String> trucks = new LinkedList<String>();
		trucks.add("Kenworth");
		trucks.add("Scania");
		trucks.add("Mercedes");
		trucks.add("Volvo");
		System.out.println(trucks);
		
		//sorting of lists
		Collections.sort(trucks, Collections.reverseOrder());
		for (String i : trucks) {
			System.out.println(i);
		}
	}
	
}

//LinkedList methods
/*
 * addFirst()	Adds an item to the beginning of the list	
	addLast()	Add an item to the end of the list	
	removeFirst()	Remove an item from the beginning of the list	
	removeLast()	Remove an item from the end of the list	
	getFirst()	Get the item at the beginning of the list	
	getLast()	Get the item at the end of the list
 */