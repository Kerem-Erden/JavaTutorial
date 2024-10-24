
public class ThreadExample extends Thread {
	public static int amount = 0;
	
	public static void main(String[] args) {
		ThreadExample threadObj = new ThreadExample();
		threadObj.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	
	public void run() {
		
		amount++;
	}

}
