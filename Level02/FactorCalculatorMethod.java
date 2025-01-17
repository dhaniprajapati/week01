//importing scanner class from util package
import java.util.Scanner;

public class FactorCalculatorMethod
{

    //initialize method to find the factors of a number
    public static int[] findFactors(int number) 
	{
        //create for loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) 
		{
			//using if statement
            if (number % i == 0) 
			{
                count++;
            }
        }

        //initialize array to store the factors
        int[] factors = new int[count];
		//create variable indext and initializeit to 0
        int index = 0;

        //run for loop to save the factors into the array
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
	        {
                factors[index] = i; //store the factor
                index++;
            }
        }

        return factors;
    }

    //initialize method to find the sum of the factors
    public static int sumOfFactors(int[] factors) 
	{
        int sum = 0;
        for (int factor : factors) 
		{
            sum += factor; //add each factor
        }
        return sum;
    }

    //initialize method to find the product of the factors
    public static int productOfFactors(int[] factors) 
	{
        int product = 1;
        for (int factor : factors) 
		{
            product *= factor; //multiply each factor
        }
        return product;
    }
    //initialize method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) 
	{
        double sumOfSquares = 0;
        for (int factor : factors) 
		{
            sumOfSquares += Math.pow(factor, 2); //add the square of each factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //to find the factors of the number
        int[] factors = findFactors(number);

        //print the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) 
		{
            System.out.print(factor + " ");
        }
        System.out.println();

        //call methods and print results
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }
}