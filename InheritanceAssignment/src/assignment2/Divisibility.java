package assignment2;

public class Divisibility extends Addition {
	
	public boolean divisible(int a, int b)
	{
		int sum = super.add(a, b);
        return sum % 10 == 0; 			// To check the sum divide by 10 is true or false, if divisible by 10 = 0 it will print as true
	}

	public static void main(String[] args) {
		
		Divisibility obj = new Divisibility();
        int a =15;
        int b =22;
        System.out.println("Sum of 2 numbers is: " + obj.add(a,b));
        System.out.println("Divisible by 10 or not: " + obj.divisible(a, b));
      }
}
