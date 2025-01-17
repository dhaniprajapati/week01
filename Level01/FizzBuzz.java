//importing scanner class from util package
import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        //taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        //check if the number is a positive integer or not
        if (number < 0) 
		{
            System.out.println("Enter a positive integer.");
            return;
        }

        //create a String array to store result
        String[] results = new String[number + 1];

        //run for loop from 0 to the number
        for (int i = 1; i <= number; i++) 
		{
            //check for multiples of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) 
			{
				//if the number is multiple of both 3 and 5
                results[i] = "FizzBuzz";
            } 
			else if (i % 3 == 0) 
			{
				//if the number is multiple of 3
                results[i] = "Fizz"; 
            } 
			else if (i % 5 == 0) 
			{
				//if the number is multiple of 5
                results[i] = "Buzz";
            } 
			else 
			{
				//not a multiple of 3 or 5
                results[i] = String.valueOf(i); 
            }
        }

        //print the results
        for (int i = 0; i < results.length; i++) 
		{
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}