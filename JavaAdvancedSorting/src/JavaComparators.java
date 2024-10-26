import java.util.Comparator;
import java.util.*;

//define a car class
class Car {
		public String brand;
		public String model;
		public int year;
		
		//constructor
		public Car(String brand, String model, int year) {
			this.brand = brand;
			this.model = model;
			this.year = year;
		}
}

//create a comparator
class SortByYear implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		Car a = (Car) obj1;
		Car b = (Car) obj2;
		
		//compare the year of the both object
		if (a.year < b.year) return -1;
		if (a.year > b.year) return 1;
		return 0;
	}
}

public class JavaComparators {
	public static void main(String[] args) {
		//create a list of cars
		ArrayList<Car> myCars = new ArrayList<Car>();
		myCars.add(new Car("BMW", "X5", 1999));
		myCars.add(new Car("Honda", "Accord", 2006));
		myCars.add(new Car("Ford", "Mustang", 1970));
		
		//using the comparator to sort the cars\
		Comparator myComparator = new SortByYear();
		Collections.sort(myCars, myComparator);
		
		//display the cars
		for (Car c : myCars) {
			System.out.println(c.brand + " " + c.model + " " + c.year);
		}
	}
}
