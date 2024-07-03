package encapsulationsample;

public class Bank {

	private int pinnum ;
	
	public void setPin (int pinnum) {					//setter
		this.pinnum = pinnum;
		
	}
	public boolean validatePin() {						//getter
		int[] validPins = {1001, 1234, 1212};
	        for (int validPin : validPins) {
	        	if (this.pinnum == validPin) {
	        return true;
            }
	      }
	        return false;
	    }
}
