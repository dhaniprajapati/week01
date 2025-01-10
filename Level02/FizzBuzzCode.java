import java.util.Scanner;

public class FizzBuzzCode 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) 
		{
            System.out.println("Please enter a positive integer.");
        } 
		else 
		{
            int i = 0; 
            //while loop from 0 to the entered number
            while (i <= number) 
			{
                //check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) 
				{
                    System.out.println("FizzBuzz");
                } 
				else if (i % 3 == 0) 
				{
                    System.out.println("Fizz");
                } 
				else if (i % 5 == 0) 
				{
                    System.out.println("Buzz");
                } 
				else 
				{
                    System.out.println(i);
                }
                i++;
			}
		}
		scanner.close();
	}
}
