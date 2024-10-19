
//abstract class
abstract class Supra {
	//abstract method
	protected abstract void horsePower();
	
	//regular method
	protected void sound() {
		System.out.println("Wutututu, chiwww");
	}
}

class OldSupra extends Supra {
	protected void horsePower() {
		//the body of horsePower() is provided here
 		System.out.println("Horse power is: 780" );
	}	
}



public class Abstraction {
	public static void main(String[] args) {
		OldSupra supraObject = new OldSupra();
		supraObject.horsePower();
		supraObject.sound();
	}

}
