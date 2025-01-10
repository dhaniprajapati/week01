import java.util.Scanner;

public class FizzBuzz 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        //check if the input is a positive integer or not using if else statement
        if (number <= 0) 
		{
            System.out.println("Please enter a positive integer.");
        }
		else 
		{
            //create for loop from 1 to the entered number
            for (int i = 1; i <= number; i++) 
			{
                //Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) 
				{
                    System.out.println("FizzBuzz");
                } 
				else if (i % 3 == 0) 
				{
                    System.out.println("Fizz");
                } 
				else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
				else 
				{
                    System.out.println(i);
                }
            }
        }

        //Close the scanner
        scanner.close();
    }
}
