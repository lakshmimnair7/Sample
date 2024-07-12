package stringsample;

public class StringMutable {

	public static void main(String[] args) {
		//StringBuffer s = new StringBuffer("Mutable");
		StringBuilder s = new StringBuilder("Mutable");
		s.insert(0,"String" ); //Insert
		System.out.println(s);
		s.replace(0, 2,"Sample"); //Replace (1st value will get replaced)
		System.out.println(s);
		s.delete(0, 1);     //Delete
		System.out.println(s); 
		s.reverse();
		System.out.println(s); //Reverse
		

	}

}
