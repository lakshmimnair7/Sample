package encapsulationsample;

public class User {
	
	public void enterPin(Bank atm, int pinnum) {
        
        atm.setPin(pinnum);						//setter
        
        if (atm.validatePin()) 
        {
            System.out.println("Enter Pin is Valid");					//getter
        } 
        else 
        {
            System.out.println("Enter Pin is Invalid");
        }
    }

	public static void main(String[] args) {
		
		
        User user = new User();
        Bank atm = new Bank();
        user.enterPin(atm, 1001); 						// Valid pin
        user.enterPin(atm, 1995); 						// Invalid pin
    }
}
