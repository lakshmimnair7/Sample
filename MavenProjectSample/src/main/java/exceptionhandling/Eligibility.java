package exceptionhandling;

public class Eligibility {
	
	int age;

	public void licence(int age)  {
		
		this.age=age;
		if(age>=18)  
			System.out.println("Eligible for Driving License");
		
		else 
		//	System.out.println("Not Eligible for Driving License");
			
		throw new ArithmeticException("Not Eligible");
		}
	

		
	public static void main(String[] args)  {
		Eligibility obj = new Eligibility();
		//obj.licence(23);
		obj.licence(15);
	}
}
