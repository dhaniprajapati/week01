//importing scanner class from util package
import java.util.Scanner;
//create a class GreatestFactor
public class GreatestFactor
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);

        //taking user inputs
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        //check if the input is valid or not
        if (number <= 1) 
		{
            System.out.println("Enter a number greater than 1:");
        } 
		else 
		{
            //create the greatest factor variable and assign value 1
            int greatestFactor = 1;

            //create for loop to find the greatest factor other than the number itself
            for (int i = number - 1; i >= 1; i--) 
			{
                if (number % i == 0) 
				{ 
				    //assign the factor
                    greatestFactor = i; 
                    break; //exit the loop
                }
            }

            // Output the greatest factor
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

        // Close the scanner
        input.close();
    }
}
