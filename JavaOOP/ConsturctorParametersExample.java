
public class ConsturctorParametersExample {
	//creates attributes
	int modelYear;
	String modelName;
	
	//create a constructor
	public ConsturctorParametersExample(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		//create an object called car
		ConsturctorParametersExample car = new ConsturctorParametersExample(2020, "BMW");
		//print the object
		System.out.println("Model year is: " + car.modelYear);
		System.out.println("Brand is: " + car.modelName);
		
	}
	
	
	
	
	
	
	
	

}
