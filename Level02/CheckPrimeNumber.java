//importing scanner class from util package
import java.util.Scanner;
//create a class CheckPrimeNumber
public class CheckPrimeNumber
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input 
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = input.nextInt();

        //taking boolean variable to store if the number is prime
        boolean isPrime = true;

        //check if the number is greater than 1 using if else statement 
        if (number <= 1) 
		{
            isPrime = false;
        } 
		else 
		{
            //creating for loop from 2 to number/2
            for(int i = 2; i <= number / 2; i++) 
			{
                // If the number is divisible by any number other than 1 and itself
                if (number % i == 0) 
				{
                    isPrime = false;
                    break; // Exit the loop
                }
            }
        }

        //print the result
        if (isPrime) 
		{
            System.out.println(number + " is a prime number.");
        } 
		else 
		{
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
