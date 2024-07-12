package assignment1;

public class Class2 extends Employee
{
	double hra, pf;
   
	public void calculateHraAndPf() 
    {
        hra = 0.05 * basicpay;
        pf = 0.20 * basicpay;
    }
}