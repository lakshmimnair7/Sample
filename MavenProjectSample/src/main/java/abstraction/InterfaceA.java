package abstraction;

public class InterfaceA implements InterfaceSample,InterfaceB{

	public static void main(String[] args) {
		
		InterfaceA obj = new InterfaceA();
		obj.addition();
		obj.multiple();
	}

	public void addition() {
		int Sum = a+b;
		System.out.println("Sum is : "+ Sum);
		
	}

	public void multiple() {
		int Multiple = x*y;
		System.out.println("Multiple is :" + Multiple);
		
	}



	
	
}
