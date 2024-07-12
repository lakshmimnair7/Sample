package accessmodifiersample;


public class Modifier {
	public void display()
	{
		System.out.println("Public Method");
	}
	private void display1()
	{
		System.out.println("Private Method");
	}
	protected void display2()
	{
		System.out.println("Protected Method");
	}
	void display3()
	{
		System.out.println("Default Method");
	}

	public static void main(String[] args) {
		Modifier obj = new Modifier();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
