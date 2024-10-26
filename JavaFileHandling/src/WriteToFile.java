import java.io.FileWriter;
import java.io.*;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("newFile.txt");
			myWriter.write("File in Java is hard.");
			myWriter.close();
			System.out.println("Successfully wrote to file. ");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
