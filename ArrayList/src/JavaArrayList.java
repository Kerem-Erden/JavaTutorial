//import the java.util
import java.util.*;

public class JavaArrayList {
	public static void main(String[] args) {
		//create an arrayList object
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Volvo");
		cars.add("Ford");
		//before the add an item at the specific position
		System.out.println(cars);
		
		//you can also add an item at the specific position
		cars.add(0,"Mazda");
		//After the add an item
		System.out.println(cars);
		
		//access an item
		String car = cars.get(0);
		System.out.println(car);
		
		//change an item
		cars.set(0, "Opel");
		System.out.println(cars); // after the change an item
		
		//remove an item (remove all clear // cars.clear() )
		cars.remove(0);
		System.out.println(cars); // after the remove an item
		
		//ArrayList size
		int size = cars.size();
		System.out.println("The size of array: " + size);
		
		//Loop through 
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//for-each loop 
		for (String i : cars) {
			System.out.println(i);
		}
		
		//sorting arrayList (alphabetic)
		Collections.sort(cars);
		System.out.print("\n");
		for (String i : cars) {
			System.out.println(i);
		}
		
		
	}

}
