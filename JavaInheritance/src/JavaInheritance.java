

class Vehicle {
		protected String brand = "Ford";     // vehicle attribute
		public void honk() {                 //vehicle method
			System.out.println("darari, dat, dat"); 
		}
		
	
	}
	
class Car extends Vehicle {
	private String  modelName = "Mustang";
		
	public static void main(String[] args) {
			
		Car myCar = new Car();
		
		myCar.honk();
		
		System.out.println(myCar.brand + " " + myCar.modelName);
			
	}
}

//If you don't want other classes to inherit from a class, use the final keyword