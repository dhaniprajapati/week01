//create FeeDiscount class 
public class FeeDiscount
{
	public static void main(String[] args)
	{
		//create a variable fee and assign the value 
		double fee= 125000;
		//create a variable discountpercent and assign the value 
		double discountPercent= 10;
		//create a variable discount
		//calculate discount
		double discount=(discountPercent/100)* fee;
		//create a variable feeToPay and calculate it
		double feeToPay= fee-discount;
		//print result 
		System.out.print("The discount amount is INR " +discount+ " and final discounted fee is INR " +feeToPay);
	}
}