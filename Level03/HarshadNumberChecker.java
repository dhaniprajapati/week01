//importing scanner object from util package
import java.util.Scanner;

//create HarshadNumberChecker class
public class HarshadNumberChecker 
{
    public static void main(String[] args)
	{
        //initialize scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //create a variable to store the sum of digits and assign value 0
        int sum = 0;

        //create a variable to store the original number for divisibility check
        int originalNumber = number;

        //create while loop to access each digit of the number
        while (number > 0) 
		{
            //to obtain the last digit
			int digit = number % 10; 
			 //adding the digit to sum
            sum += digit;
			 //removing the last digit
            number = number / 10;
        }

        //checking if the original number is divisible by the sum of its digits or not
        if (originalNumber % sum == 0) 
		{
            System.out.println("Harshad Number");
        } 
		else 
		{
            System.out.println("Not a Harshad Number");
        }
		input.close();
    }
}
