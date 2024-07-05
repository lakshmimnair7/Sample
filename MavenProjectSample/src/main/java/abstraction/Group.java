package abstraction;

public class Group implements Group2 {

	public static void main(String[] args) {
		
		Group obj = new Group();
		obj.addition();
		obj.multiple();
		//interfacename obj = new classname();    //most important in selenium
		Group2 obj1 = new Group();
		obj1.addition();
		obj1.multiple();
		
	}

	public void multiple() {
		System.out.println("Interface extends and implemented in Group");
		
	}

	public void addition() {
		System.out.println("Group implements extended interface");
	}

}
