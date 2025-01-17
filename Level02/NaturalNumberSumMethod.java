//importing scanner class from util package
import java.util.Scanner;

public class NaturalNumberSumMethod
{

    //initialize method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) 
	{
		//check if n=1 and return 1
        if (n == 1) 
		{
            return 1;
        }
		//using resursion method to return result
        return n + sumOfNaturalNumbers(n - 1);
    }

    //initialize method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) 
	{
		//using formula to return the result
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        //check if the input is a natural number
        if (n < 1) 
		{
            System.out.println("Enter a natural number greater than 0.");
            scanner.close();
            return;
        }

        //call method to calculate the sum using recursion
        int recursiveSum = sumOfNaturalNumbers(n);
        //call method to calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);

        //print the result
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        //compare the results
        if (recursiveSum == formulaSum) 
		{
            System.out.println("Both results are correct and equal.");
        } 
		else 
		{
            System.out.println("The results are not same.");
        }
        scanner.close();
    }
}