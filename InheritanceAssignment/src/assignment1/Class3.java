package assignment1;

public class Class3 extends Class2
	{
	double totalSalary;

    public void calculateTotalSalary() 
    {
        totalSalary = basicpay + hra - pf - deduction + bonus; 			//To find the Total salary
    }

    public void displaySalarySlip() 
    {
    	System.out.println("Salary Slip:");
        System.out.println("Basic Pay: " + basicpay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        
    }

    public static void main(String[] args) 
    {
		
		Class3 salarySlip = new Class3();
		salarySlip.getDetails();	// Get employee details
        salarySlip.calculateHraAndPf();	// Calculate HRA and Pf
        salarySlip.calculateTotalSalary();	 // Calculate total salary
        salarySlip.displaySalarySlip();		// Display salary slip
     }

}

   
        
