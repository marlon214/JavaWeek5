package week5;

public class SpacedLogger implements Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpacedLogger hello = new SpacedLogger();
		hello.Log("Hello");
		System.out.println();
		hello.Error("Hello");
	}

	@Override
	public void Log(String string) {
		// TODO Auto-generated method stub
		for (int i=0; i<string.length(); i++)
			System.out.print(string.charAt(i)+" ");
		System.out.println();
	}

	@Override
	public void Error(String string) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		for (int i=0; i<string.length(); i++)
			System.out.print(string.charAt(i)+" ");
		
	}

}
