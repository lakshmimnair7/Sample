package stringsample;

public class StringSample {

	public static void main(String[] args) {
		
		char a[] = {'a','e','i','o','u'};
		String S ="Welcome"; 	//literal string
		System.out.println(S);
		String obj = new String("java"); //new keyword string
		System.out.println(obj);
		String obj1 = new String(a); //conversion of array to string
		System.out.println(obj1);
	}
	

}
