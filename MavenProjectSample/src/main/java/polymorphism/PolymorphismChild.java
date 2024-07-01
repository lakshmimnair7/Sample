package polymorphism;

public class PolymorphismChild extends PolymorphismParent {
	
	public void display()
	{
		System.out.println("Child class method");
		super.display();
	}

	public static void main(String[] args) {
		
		PolymorphismParent obj = new PolymorphismParent();
		obj.display();

	}

}
