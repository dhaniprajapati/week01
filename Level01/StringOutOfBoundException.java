//importing scanner class from java util package
import java.util.Scanner;

// Class to demonstrate StringIndexOutOfBoundsException
public class StringOutOfBoundException
{
    public static void generateException(String input)
    {
        //access a character at an index beyond the string length
        //this will cause StringIndexOutOfBoundsException
        char character = input.charAt(input.length());
    }
    // Method to handle StringIndexOutOfBoundsException using try-catch block
    public static void handleException(String input)
    {
        try
        {
            //to generate the exception
            generateException(input);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            //catching and printing the exception message
            System.out.println("Exception caught: " + e);
        }
    }
    public static void main(String[] args)
    {
        // Creating a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        // Calling the method to generate the exception generation
        generateException(userInput);
        // Calling the method to handle the exception using try-catch
        handleException(userInput);
    }
}
