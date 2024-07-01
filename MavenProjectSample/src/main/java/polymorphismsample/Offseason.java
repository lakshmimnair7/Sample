package polymorphismsample;

public class Offseason extends Onseason{
	
	double discount;
	public void discount() {
		
		
		discount = price * 0.15;
		System.out.println("Discount Rate is :" + discount);
		super.discount();
	}

	public static void main(String[] args) {
	
		Offseason obj = new Offseason();
		obj.discount();
		
	}

}
