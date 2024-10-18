
class OuterClass {
	int x = 10;
	//Inner class can be protected or private
	class InnerClass {
		int y = 5;
	}
}


public class InnerClasses {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myOuter.x + myInner.y);
		
	}
}
