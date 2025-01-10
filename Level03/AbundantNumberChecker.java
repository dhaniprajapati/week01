//importing scanner object from util package
import java.util.Scanner;

// Create AbundantNumberChecker class
public class AbundantNumberChecker
{
    public static void main(String[] args)
	{
        //initializing Scanner object
        Scanner input = new Scanner(System.in);

        //taking user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //create a variable to store the sum of divisors and assign value 0
        int sum = 0;

        //run for loop to find divisors of the number
        for (int i = 1; i < number; i++) 
		{
            //check if 'i' is a divisor of 'number'
            if (number % i == 0) 
			{ 
			//Adding 'i' to the sum of divisors
                sum += i; 
            }
        }

        //checking if the sum of divisors is greater than the number
        if (sum > number) 
		{
            System.out.println("Abundant Number");
        } 
		else 
		{
            System.out.println("Not an Abundant Number");
        }
		input.close();
    }
}
