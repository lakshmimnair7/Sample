package exceptionhandling;

public class ExceptionSample {
	
	int a=5,div;

	public void division() {
		
		try 
		{
		div = a/0;
		System.out.println("Division is :" + div);
		}
		catch(Exception e)
		{
			System.out.println("Division by zero not possible:" + e);
		}
	}

	public static void main(String[] args) {
	ExceptionSample obj = new ExceptionSample();
	obj.division();

	}

}
