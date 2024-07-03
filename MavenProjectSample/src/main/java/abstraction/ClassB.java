package abstraction;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		
		ClassA.abstractsample();
		ClassB obj = new ClassB();
		obj.abstractsample2();
		obj.display();
		
}

	@Override
	public void display() {
	System.out.println("Hello");
	}

}
