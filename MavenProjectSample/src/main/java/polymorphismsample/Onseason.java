package polymorphismsample;

public class Onseason {
	
	int price = 599;
	double discountrate;
	
	public void discount() {
		
		discountrate = price * 0.40;
		System.out.println("Discount Rate on Onseason is :" + discountrate);
	}
	
}

