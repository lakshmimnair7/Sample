package aggregation;

public class Aggregation2 {
	int x,y;
	Aggregation1 ag;
	
	public Aggregation2(int x, int y, Aggregation1 ag) {
		this.x=x;
		this.y=y;
		this.ag=ag;
		
	}
	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(ag.a);
		System.out.println(ag.b);
	}
	public static void main(String[] args) {
		Aggregation1 obj = new Aggregation1(20,10);
		Aggregation2 obj1 = new Aggregation2(15,20,obj);
		obj1.display();
		

	}

}
