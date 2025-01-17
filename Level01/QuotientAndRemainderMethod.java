 //import the Scanner class from util package
import java.util.Scanner;

public class QuotientAndRemainderMethod
{

    //initialize method to find the remainder and quotient of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
        int quotient = number / divisor;
        int remainder = number % divisor;
		 // Return the result in an array
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        //call the method
        int[] result = findRemainderAndQuotient(number, divisor);

        //print the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        scanner.close();
    }
}