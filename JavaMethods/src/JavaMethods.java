
public class JavaMethods {
	static void FirstMethods() 
	{
		System.out.println("This is my first method.");
	}
	
	static void myMethodts(String fname, int age) {
		System.out.println(fname + " Jordan" + " is " + age);
		if (age < 18) {
			System.out.println("Access granted.");
		}
		
		else {
			System.out.println("Access denied.");
		}
	}
	
	static int myInteger(int x, int y) {
		return x + y;
	}
	
	static int plusMethodInt(int x, int y) {
		return x + y;
	}
	
	static double plusMethodDouble(double x, double y) {
		return x + y;
	}
	
	//Method overloading
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}
	
	
	
	public static void main(String[] args) {
		FirstMethods();
		myMethodts("Micheal", 43);
		myMethodts("Bradd", 55);
		System.out.println(myInteger(3,5));
		plusMethodInt(3,4);
		plusMethodDouble(2.2,3.3);
		plusMethod(4,5);
		plusMethod(2.3,3.4);
		int result = sum(10);
		System.out.println(result);
	}
	//recursion function
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	}
	
	
	

