//importing scanner class from util package
import java.util.Scanner;
//create a class CalculatePower
public class CalculatePower
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);

        //taking user inputs
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        //create a variable and assign value 1
        int result = 1;

        //create for loop to calculate the power
        for (int i = 1; i <= power; i++) 
		{
		  //multiply the result by the number
            result *= number;
        }

        //Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        //close the scanner
        input.close();
	}
}
