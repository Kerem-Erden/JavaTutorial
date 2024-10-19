interface Ford {
	public void bestModelOfFord();
}

interface Mercedes {
	public void bestModelOfMercedes();
}


class Cars implements Ford, Mercedes {
	public void bestModelOfFord() {
		System.out.println("Best model of Ford: F150");
	}
	public void bestModelOfMercedes() {
		System.out.println("Best model of Mercedes: S500");
	}
}
public class MultipleInterface {
	public static void main(String[] args) {
		Cars carsObject = new Cars();
		carsObject.bestModelOfFord();
		carsObject.bestModelOfMercedes();
	}
}
