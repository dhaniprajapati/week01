//importing scanner class from util package
import java.util.Scanner;
//create SumOfDigits class
public class SumOfDigits
{
	public static void main(String[] args);
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);
		//taking user input
		System.out.print("Enter the number: ");
		double number= input.nextDouble();
		//creating Variable total and assign the value
		double total= 0.0;
		
		while(number!=0)
		{
			total+= number;
			System.out.print("Enter the number(0 to stop):  ");
		}
		System.out.print("The total sum is: " + total);
		input.close();
	}
}

		
		
		
	
