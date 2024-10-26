import java.io.*;

public class DeleteFiles {
	public static void main(String[] args) {
		File myObj = new File("newFile.txt");
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file");
		}
		
	}
}
