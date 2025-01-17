//importing scanner class from util package
import java.util.Scanner;
//Create NumberSignCheckerMethod class 
public class NumberSignCheckerMethod
{
	//method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) 
	{
        //apply if else statement to check and return -1 for negative numbers, 1 for positive numbers, and 0 for zero
        if (number < 0) {
            return -1;
        } 
		else if (number > 0) 
		{
            return 1;
        } 
		else 
		{
            return 0;
        }
    }

	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//call the method to check the number
        int result = checkNumber(number);
        //print the result we get from return
        if (result== 1) 
		{
            System.out.print("The number is positive.");
        } 
		else if (result== -1) 
		{
            System.out.print("The number is negative.");
        } 
		else 
		{
            System.out.print("The number is zero.");
        }
		//closing scanner class
        input.close();
    }
}