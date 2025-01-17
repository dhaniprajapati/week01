// Importing Scanner class from util package
import java.util.Scanner;

// Create class
public class ArrayOutOfBoundsException
{
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(int[] number)
    {
        System.out.println("Attempting to access an index larger than the array length...");
        // This will generate ArrayIndexOutOfBoundsException
        System.out.println(number[number.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(int[] number)
    {
        try
        {
            System.out.println("Attempting to access an index larger than the array length...");
            // This will generate ArrayIndexOutOfBoundsException
            System.out.println(number[number.length]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (RuntimeException e)
        {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        // To store array elements
        int[] number = new int[n];
        // Run for loop to take input from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
        {
            number[i] = scanner.nextInt();
        }
        // Call method to generate the exception
        try
        {
            generateException(number);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught in main: ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Call method to handle the exception
        handleException(number);
        scanner.close();
    }
}
