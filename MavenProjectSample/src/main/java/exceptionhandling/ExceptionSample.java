package exceptionhandling;

public class ExceptionSample {
	
	int a=5,div;

	public void division() {
		
		try 
		{
		div = a/0;
		System.out.println("Division is :" + div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero not possible:" + e);
		}
		finally
		{
			System.out.println("Exception Handles Successfully");
		}
	}

	public static void main(String[] args) {
	ExceptionSample obj = new ExceptionSample();
	obj.division();

	}

}
