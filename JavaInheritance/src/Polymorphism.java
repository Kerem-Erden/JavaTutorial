
class Animal {
	
	public void animalSound () {
		System.out.println("The animal makes a sound");
	}

}

class Dog extends Animal{
	public void animalSound() {
		System.out.println("The pig says: wow wow");
	}
	
}

class Polymorphism {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    
	    myDog.animalSound();
	  }
	}