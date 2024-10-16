
public class JavaOOP {
	// if you want to create an unchangeable value you should use the
	//final keyword in front of the variable.
	int x = 5;
	
	//create a static method
	static void myStaticMethod() {
		System.out.println("Can be called without creating objects");
	}
	
	//create a public method
	public void myPublicMethod() {
		System.out.println("Can only called by creating objects");
	}
	
	public static void main(String[] args) {
		//Creating an object 
		JavaOOP firstObject = new JavaOOP();
		System.out.println(firstObject.x);
		// call the static Method
		myStaticMethod();
		//call the public Method
		//myPublicMethod(); it give an error 
		
		firstObject.myPublicMethod();//***called the public method on the object
		
	}
}
