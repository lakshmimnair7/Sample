package stringsample;

public class ImmutableString {

	public static void main(String[] args) {
		String s = "Immutable";
		s=s.concat("String"); //here we assign s = s.concat value, if we didn't give thn it will only print the 1st value
		System.out.println(s); 			//concat
		char ch = s.charAt(3);     		//charAt
		System.out.println(ch);
		String s1="hello"; 				 //compare
		String s2="to";  
		String s3="World";  
		System.out.println(s1.compareTo(s2));  
		System.out.println(s2.compareTo(s3)); 
		String name="My name is lakshmi";  			//contains
		System.out.println(name.contains("My name"));  
		System.out.println(name.contains("is"));  
		System.out.println(name.contains("laxmi")); 
		String a1="java by javatpoint";  				//endsWith
		System.out.println(a1.endsWith("t"));    	
		System.out.println(a1.endsWith("java"));  
		String b1="lakshmi";   				//equals
		String b2="laxmi";  
		String b3="lakshmi";  
		System.out.println(b1.equals(b2));//true because content and case is same  
		System.out.println(b1.equals(b3));
		int value=30;   				//valueof
		String a=String.valueOf(value);  
		System.out.println(a);
		String x="  hello   ";   //trim
		System.out.println(x+"world");//without trim()  
		System.out.println(x.trim()+" to world");//with trim()  
		String b="hello string";   						//toUpperCase
		String bupper=b.toUpperCase();  
		System.out.println(bupper);  
		String c1="aelcome to the world";       		//replaceString
		String replaceString=c1.replaceAll("a","w");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);
		String joinString1=String.join("-","welcome","to","world");   		//joinstring
		System.out.println(joinString1); 
		String namee="lachu";  						//format
		String sf1=String.format("name is %s",namee);  
		String sf2=String.format("age is %f",25.00);  
		System.out.println(sf1);  
		System.out.println(sf2);  
		String obj="hello world ";     				//split
		String[] words=obj.split("\\s");
		for(String w:words){  
		System.out.println(w);  }  
		String I1="this is index of example";//there are 2 's' characters in this sentence   //lastIndex
		int index1=I1.lastIndexOf('y');//returns last index of 'y' char value  
		System.out.println(index1);
		String z1="";         	  					//isEmpty
		String z2="javatpoint";  
		System.out.println(z1.isEmpty());  
		System.out.println(z2.isEmpty());  
	
	}
}
