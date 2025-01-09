//import scanner class from util package
import java.util.Scanner;
public class DiscountCalculation
{
	public static void main(String[] args)
	{
		//initialize scanner class object	
		Scanner input= new Scanner(System.in);
		
		//create a variable fee 
		System.out.print("Fee amount: ");
		double fee= input.nextDouble();
		
		//create a variable discountPercent 
		System.out.print("Discount Percent: ");
		double discountPercent= input.nextDouble();
		
		//create a variable discount
		//calculate discount
		double discount=(discountPercent/100)*fee;
		
		//create a variable feeToPay and calculate it
		double feeToPay= fee-discount;
		//print result 
		System.out.print("The discount amount is INR " +discount+ " and final discounted fee is INR " +feeToPay);
	}
}