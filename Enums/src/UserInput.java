// import the Scanner class
import java.util.Scanner;

public class UserInput {
	
	public static void main (String[] args) {
		
		//create the input object
		Scanner inputObject = new Scanner(System.in);
		System.out.println("Enter the username, age, weight ");
		
		//read user input 
		String userName = inputObject.nextLine();
		int age = inputObject.nextInt();
		double weight = inputObject.nextDouble();
		
		//display the user input
		System.out.println("Username is: " + userName);
		System.out.println("Age is: " + age);
		System.out.println("Weight is: " + weight);
	
	
	
	}

}
