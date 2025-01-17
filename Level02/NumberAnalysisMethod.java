//importing scanner class from util package
import java.util.Scanner;

public class NumberAnalysisMethod
{

    //initialize method to check whether the number is positive or negative
    public static boolean isPositive(int number) 
	{
		//return true if the number is positive
        return number >= 0; 
    }

    //initialize method to check whether the number is even or odd
    public static boolean isEven(int number) 
	{
		//return true if the number is even
        return number % 2 == 0; 
    }

    //method to compare two numbers
    public static int compare(int number1, int number2) 
	{
        if (number1 > number2) 
		{
            return 1;
        } 
		else if (number1 < number2) 
		{
            return -1; 
        } 
		else 
		{
            return 0;
        }
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		 //create array to store 5 numbers
        int[] numbers = new int[5];

        //run loop to take user input for the numbers
        for (int i = 0; i < numbers.length; i++) {
		
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //run for loop to check each number if it is positive, negetive, even or odd
        for (int number : numbers) 
		{
            if (isPositive(number)) 
			{
                System.out.println(number + " is positive.");
                if (isEven(number)) 
				{
                    System.out.println(number + " is even.");
                } 
				else 
				{
                    System.out.println(number + " is odd.");
                }
            } 
			else 
			{
                System.out.println(number + " is negative.");
            }
        }

        //compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) 
		{
            System.out.println("The first number is greater than the last number.");
        } 
		else if (comparisonResult == -1) 
		{
            System.out.println("The first number is less than the last number.");
        } 
		else 
		{
            System.out.println("The first number is equal to the last number.");
        }

        scanner.close();
    }
}