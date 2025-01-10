//importing scanner class from util package
import java.util.Scanner;

public class MultipleFinder 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        //checking if the number is positive or not 
        if (number <= 0) 
		{
            System.out.println("Enter a positive integer greater than 0");
        } 
		else 
		{
            System.out.println("Multiples of " + number + " below 100 are:");

            //create for loop in backward from 100 to 1
            for (int i = 100; i >= 1; i--) 
			{
                //checking if i is a multiple of the number or not
                if (i % number == 0) 
				{
                    System.out.println(i);
                }
            }
        }
        //close the scanner
		scanner.close();
	}
}

