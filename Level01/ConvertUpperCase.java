// Importing Scanner class from util package
import java.util.Scanner;

// Create class ConvertUpperCase
public class ConvertUpperCase
{
    // Method to convert lowercase characters to uppercase using user defined ASCII
    public static String userDefined(String word)
    {
        // Initialize a char array for processing
        char[] temp = new char[word.length()]; 

        // Run for loop to check each character
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') // Check for lowercase letters
            {
                // Convert to uppercase by subtracting 32
                temp[i] = (char) (ch - 32);
            }
            else
            {
                // Keep the character as it is if not lowercase
                temp[i] = ch;
            }
        }

        return new String(temp); // Convert char array to String
    }

    // Method to convert string to uppercase using built-in method
    public static String inBuilt(String word)
    {
        return word.toUpperCase(); // Corrected method to return uppercase string
    }

    // Method to compare two results
    public static boolean compareStrings(String userDefined, String inBuilt)
    {
        return userDefined.equals(inBuilt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        // Convert to uppercase using the built-in method
        String builtIn = inBuilt(word);

        // Convert to uppercase using the user-defined method
        String userDefined = userDefined(word);

        // Compare results
        boolean areEqual = compareStrings(userDefined, builtIn);

        // Print the results
        System.out.println("Text converted to uppercase using built-in method: " + builtIn);
        System.out.println("Text converted to uppercase using user-defined method: " + userDefined);
        System.out.println("Are both methods giving the same result? " + areEqual);
    }
}
