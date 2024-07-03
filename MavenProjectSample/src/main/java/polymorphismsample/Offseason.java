package polymorphismsample;

public class Offseason extends Onseason{
	
	int price = 1000;
	double discountrate;
	public void discount() {
		
		discountrate = price * 0.15;
		System.out.println("Discount Rate on Offseason is :" + discountrate);
		super.discount();
	}

	public static void main(String[] args) {
	
		Offseason obj = new Offseason();
		obj.discount();
		
	}

}
