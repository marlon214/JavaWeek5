package week5;

interface Logger{
void Error(String string);
void Log(String string);

}
public class AsteriskLogger implements Logger{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger hi = new AsteriskLogger();
		hi.Log("Hello");
		System.out.println();
		hi.Error("Hello");

	}

	@Override
	public void Log(String string) {
		// TODO Auto-generated method stub
		System.out.println("***"+string+"***");
		
	}

	@Override
	public void Error(String string) {
		// TODO Auto-generated method stub
		System.out.println("******************");
		System.out.println("***Error: "+string+"***");
		System.out.println("******************");


	}

}

