// Importing Scanner class from util package
import java.util.Scanner;

// create class IllegalArgumentException
public class IllegalArgumentException
{

    // Method to generate IllegalArgumentException
    public static void generateException(String text)
    {
        //print a substring with an invalid range
        System.out.println(text.substring(5, 2));
    }
    // Method to handle exceptions
    public static void handleException(String text)
    {
        try
        {
            // Call the method that generates the exception
            generateException(text);
        }
        catch (java.lang.IllegalArgumentException e)
        {
            // Handle IllegalArgumentException
            System.out.println("Found IllegalArgumentException...." );
        }
        catch (RuntimeException e)
        {
            // Handle runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // ask user to enter a string
        System.out.println("Enter a string:");
        String usertext = scanner.nextLine();
        // Call the method to handle the exception
        handleException(usertext);
        // Close the Scanner object
        scanner.close();
    }
}
