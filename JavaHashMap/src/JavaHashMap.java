//import the java.util
import java.util.*;

public class JavaHashMap {
	public static void main(String[] args) {
		//create a hashmap object
		HashMap<String,String> capitalCities = new HashMap<String,String>(); //key/value
		
		//add keys and values 
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		System.out.println(capitalCities + "\n");
		
		//access an item
		String capital = capitalCities.get("England");
		System.out.println(capital + "\n");
		
		//remove an item if you want to clear all of them use the object.clear()
		capitalCities.remove("England");
		System.out.println(capitalCities + "\n");
		
		//size
		System.out.println("The size of HashMap: " + capitalCities.size());
		
		//loop through (any type)
		for (String i : capitalCities.keySet()) {
			System.out.println(i); //with keys
		}
		System.out.println("\n");
		for (String i : capitalCities.values()) {
			System.out.println(i); //with values
		}
	}
}
