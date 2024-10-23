import java.util.*;

public class JavaHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		
		//add
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("KIA");
		cars.add("BMW");//bmw is added twice but appears once because every item is unique 
		System.out.println(cars + "\n");
		
		//check item
		System.out.println("item: " + cars.contains("BMW"));
		
		//remove (clear remove the all item)
		cars.remove("Ford");
		System.out.println(cars + "\n");
		
		//size
		System.out.println("Size of HashSet: " + cars.size());
		
		//loop (any type)
		for (String i : cars) {
			System.out.println(i);
		}
		
	}
}
