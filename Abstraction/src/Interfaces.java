
//Interface class
interface BMW {
	public void sound(); // interface method  (doesn't have a body)
	public void horsePower(); // interface method  (doesn't have a body)
	
}

 class OldBMW implements BMW {
	 public void sound() {
		 //body of sound method
		 System.out.println("Sound of old BMW: girrrrrrrrrrrrr");
	 }
	 
	 public void horsePower() {
		 //body of horsePower method
		 System.out.println("Horse power of old BMW: 371");
	 }
 }


public class Interfaces {
	public static void main(String[] args) {
		//create a object
		OldBMW supraObject = new OldBMW();
		supraObject.horsePower();
		supraObject.sound();
	}
}
