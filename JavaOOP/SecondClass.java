
public class SecondClass {
	public static void main(String[] args) {
		//Creating an object 
		JavaOOP firstObject = new JavaOOP();
		//you can also modify the attribute values.
		firstObject.x =40;
		System.out.println(firstObject.x);
		
		// call the method from another class file
		//creating a car object called myCar
		ExampleCarClass myCar = new ExampleCarClass();
		//call the methods
		myCar.fullThrottle();
		myCar.speed(330);
	}

}
