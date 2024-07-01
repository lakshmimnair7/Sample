package finalkeyword;

public class FinalKeyword extends ClassA{
	
	final int a=5;
public FinalKeyword()
{
	//a=3;
}
	/*public  final void display()
	{
	Final methods cannot be Override.class
	System.out.println("Final ClassA method");
	} */
	public static void main(String[] args)
	{
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.a);
		obj.display();
	}
}
