import java.io.File;

public class GetFileInfo {
	public static void main(String[] args) {
		File myObj = new File("newFile.txt");
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absoulte path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable: " + myObj.canRead());
			System.out.println("File size in bytes: " + myObj.length());
		} else {
			System.out.println("This file doesn't exist.");
		}
	}

}
