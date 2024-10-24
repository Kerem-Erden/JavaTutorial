//extends Thread
public class JavaThreads extends Thread {
	public static void main(String[] args) {
		JavaThreads threadObject = new JavaThreads();
		threadObject.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}

}
/*
//implements Thread
public class JavaThreads implements Thread {
	public static void main(String[] args) {
		JavaThreads threadObject = new JavaThreads();
		threadObject.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}

}
*/