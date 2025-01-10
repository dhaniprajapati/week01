//importing scanner class from util package
import java.util.Scanner;
//Create SumOfNaturalNumbers class 
public class SumOfNaturalNumbers
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		// Check if the number is a natural number
        if (number >= 0) 
		{
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.print("The sum of " + number + " natural numbers is " + sum);
        } 
		else 
		{
            System.out.print("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}