//importing scanner class from util package
import java.util.Scanner;
//Create CalculateFactorial class 
public class CalculateFactorial
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();
		
		// Check for the positive number using if else statement
        if (num < 0) 
		{
            System.out.println("The number is negetive so the factorial is not defined.");
        } 
		else if (num == 0) 
		{
            System.out.println("The factorial of 0 is 1.");
        } 
		else 
		{
            
            int factorial = 1;
            int i = 1;

            // Calculate the factorial using a while loop
            while (i <= num) 
			{
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + num + " is " + factorial + ".");
        }

        // Close the scanner
        input.close();
    }
}