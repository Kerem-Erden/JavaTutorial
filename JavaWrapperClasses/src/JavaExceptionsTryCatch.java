
public class JavaExceptionsTryCatch {
	//throw create a error type
			static void checkAge(int age) {
				if (age < 18) {
					throw new ArithmeticException("Access denied - Ymust be at least 18 years old");
				}
				else {
					System.out.println("Access granted - You are old enough!");
				}
			}
			
	public static void main(String[] args) {
		int numbers[] = {1, 2, 3};
		//try-catch blocks
		try {
			System.out.println(numbers[10]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong!!");
		}
		//finally
		finally {
			System.out.println("Finally blocks execute code regadless of the result");
		}
		
		//call the checkAge method test for the throw
		checkAge(20);
		
	}
		
}
