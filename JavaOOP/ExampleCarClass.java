
public class ExampleCarClass {
	
	//creating a method called fullThrottle
	public void fullThrottle() {
		System.out.println("Super fast car!");
	}
	//creating a method called speed
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) {
		//creating a car object called myCar
		ExampleCarClass myCar = new ExampleCarClass();
		//call the methods
		myCar.fullThrottle();
		myCar.speed(330);
	}

}
	