
public class JavaWrapper {
	public static void main(String[] args) {
		//creating the wrapper objects
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
		//intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
		System.out.println(myInt.intValue());
		
		//convert wrapper object to string toString()
		myInt = 100;
		String myString = myInt.toString();
		System.out.println("Lenght of the string: " + myString.length());
		
	}

}
