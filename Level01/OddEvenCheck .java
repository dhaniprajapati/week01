//importing scanner class from util package
import java.util.Scanner;
//Create OddEvenCheck class 
public class OddEvenCheck
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        //get the input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//checking if the number is a natural number
        if (number < 1) 
		{
            System.out.println("Please enter a natural number greater than 0.");
        } 
		else 
		{
            //using for loop to iterate from 1 to the number entered by user
            for (int i = 1; i <= number; i++) 
			{
                //check if the number is odd or even using if else 
                if (i % 2 == 0) 
				{
                    System.out.println(i + " is an even number.");
                } 
				else 
				{
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        //close the scanner
        scanner.close();
    }
}