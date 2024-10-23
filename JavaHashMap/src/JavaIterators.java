import java.util.*;

public class JavaIterators {
	public static void main (String[] args) {
		
		//make a collection
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(10);
	    numbers.add(5);
	    numbers.add(3);
	    numbers.add(56);
	    
	    //get the iterator
	    Iterator<Integer> it = numbers.iterator();
	    
	    //print the first item
	    System.out.println(it.next());
	    
	    
	    
	    //example
	    while (it.hasNext()) {
	    	Integer i = it.next();
	    	if(i < 10) {
	    		it.remove();
	    	}
	    }
	    System.out.println("After teh removing les then 10 item: " + numbers);
	}
}
