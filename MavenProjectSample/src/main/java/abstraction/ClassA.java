package abstraction;

public abstract class ClassA {
	
		public ClassA() {
			
			System.out.println("It is a Constructor");
		}
	public static void abstractsample() {
		System.out.println("Static Method");
	}	
	
	public void abstractsample2() {
		System.out.println("Instance Method");
	}
	
	public abstract void display(); //The data is hide
		
	
	
}
