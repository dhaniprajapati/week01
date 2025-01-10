//importing scanner class from util package
import java.util.Scanner;
//Create BonusCalculation class 
public class BonusCalculation
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        //get the input from the user
        System.out.print("Enter salary amount: ");
        double salary = input.nextDouble();
		System.out.print("Enter year of service: ");
        double yearsOfService = input.nextDouble();
		//calculate the bonus if the years of service is more than 5
		//create variable and assign value 0
        double bonus = 0;
        if (yearsOfService > 5) 
		{
		    //taking 5% bonus in double value
            bonus = salary * 0.05;  
        }

        //Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        //Close the scanner
		input.close();
	}
}
	
		