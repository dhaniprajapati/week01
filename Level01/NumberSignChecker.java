//importing scanner class from util package
import java.util.Scanner;
//Create NumberSignChecker class 
public class NumberSignChecker
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the number is positive, negative, or zero using if-else statement
        if (number > 0) 
		{
            System.out.print("The number is positive.");
        } 
		else if (number < 0) 
		{
            System.out.print("The number is negative.");
        } 
		else 
		{
            System.out.print("The number is zero.");
        }
		//closing scanner class
        input.close();
    }
}