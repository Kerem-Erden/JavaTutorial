
public class Enums {
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		 Level myVariable = Level.MEDIUM;
		 System.out.println(myVariable);
		 //enum values method
		 for (Level myVariables : Level.values()) {
			 System.out.println(myVariables);
		 }
	}
}
