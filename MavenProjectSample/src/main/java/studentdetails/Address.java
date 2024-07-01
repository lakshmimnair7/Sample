package studentdetails;

public class Address {
	
	String address;
	Student stud; // Parent class with reference variable
	
	public Address(String address,Student stud) {
	
		this.stud=stud;
		this.address=address;
		}

	
	public void display1() {
		System.out.println(stud.name);
		System.out.println(stud.rollNumber);
	    System.out.println(address);
		
	}

	public static void main(String[] args) {
		Student obj = new Student("Lakshmi ", 21);
		Address obj1 = new Address("Rhine G",obj);
		obj1.display1();
		

	}

}
