
public class FirstJavaProject  {

	public static void main(String[] args) {
		System.out.println("Hello");
        System.out.println("Today I am learning Java. ");
        System.out.print("This command does not print a new line. ");
        System.out.print("Example.\n");
        System.out.println(9 * 9);
        //This is a single comment line.
        /*This is a multi line comment.
         * ex1
         * ex2
         * ex3
         */
        
        String name = "Kerem";
        final int age = 30;
        double weight = 90.75;
        String firstLetterOfTheSurname = "A";
        boolean test = true;
        
        System.out.println("Hello " + name);
        
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
        
        //int x = 5, y = 6, z = 50;
        //System.out.println(x + y + z);
        
        // strings
        
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        
        String txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt2.length());
        
        String txt3 = "Hello World";
        System.out.println(txt3.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt3.toLowerCase());   // Outputs "hello world"
        
        System.out.println(name.concat(firstLetterOfTheSurname));
        
        String txt4 = "Babaji lambur gumbur \"meme\".";
        
        //Math
        Math.max(5, 10);
        Math.min(5, 10);
        Math.random();
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        Math.abs(-4.7);
        Math.sqrt(64);
        
        /*//conditions and statements 
        if (age == 19) {
        	  // block of code to be executed if the condition is true
        	}
        
        if (condition) {
        	  // block of code to be executed if the condition is true
        	} else {
        	  // block of code to be executed if the condition is false
        	}
        
        if (condition1) {
        	  // block of code to be executed if condition1 is true
        	} else if (condition2) {
        	  // block of code to be executed if the condition1 is false and condition2 is true
        	} else {
        	  // block of code to be executed if the condition1 is false and condition2 is false
        	}
        
        int day = 4;
        switch (day) {
          case 6:
            System.out.println("Today is Saturday");
            break;
          case 7:
            System.out.println("Today is Sunday");
            break;
          default:
            System.out.println("Looking forward to the Weekend");
        }
        */
        
        //LOOPS
        
        int i = 0;
        while (i < 5) {
        	System.out.println(i);
        	i++;
        }
        i = 0;
        do {
        	System.out.println(i);
        	i++;
        }
        while(i < 5);
        
        
        for (i = 0; i < 5; i++);{
        	System.out.println(i);
        }
        
        //Nested loop
     // Outer loop
        for (i = 1; i <= 2; i++) {
          System.out.println("Outer: " + i); // Executes 2 times
          
          // Inner loop
          for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
          }
        } 
        
        //For Each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
          System.out.println(car);
        }
        
        //break and continue
        
        i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) {
            break;
          }
        }
        
        i = 0;
        while (i < 10) {
          if (i == 4) {
            i++;
            continue;
          }
          System.out.println(i);
          i++;
        }
        
        //Arrays
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);
        
        //Arrays length
        System.out.println(cars2.length);
        
        //Multi dimentional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (i = 0; i < myNumbers.length; ++i) {
          for (int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
          }
        }
        
        
        
        
        
        
        
	}

}
