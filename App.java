package week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpacedLogger hello = new SpacedLogger();
		hello.Log("Hello");
		System.out.println();
		hello.Error("Hello");
		
		System.out.println();
		System.out.println();
		
		AsteriskLogger hi = new AsteriskLogger();
		hi.Log("Hello");
		System.out.println();
		hi.Error("Hello");
	}

}
