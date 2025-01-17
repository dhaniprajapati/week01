// Importing Scanner class from util package
import java.util.Scanner;
// Create class ConvertToLowerCase
public class ConvertLowerCase
{
    // Method to convert uppercase characters to lowercase using user defined ASCII
    public static String userDefined(String word)
    {
		//initialize a char array for processing
        char[] temp = new char[word.length()]; 
        //run for loop to check each character
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') // Check for uppercase letters
            {
                // Convert to lowercase by adding 32
                temp[i] = (char) (ch + 32);
            }
            else
            {
                // Keep the character as it is if uppercase
                temp[i] = ch;
            }
        }
        return new String(temp); // Convert char array to String
    }
    // Method to convert string to lowercase using built-in method
    public static String inBuilt(String word)
    {
        return word.toLowerCase(); // Corrected method to return lowercase string
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

        // Convert to lowercase using the built-in method
        String builtIn = inBuilt(word);

        // Convert to lowercase using the user-defined method
        String userDefined = userDefined(word);

        // Compare results
        boolean areEqual = compareStrings(userDefined, builtIn);

        // Print the results
        System.out.println("Text converted to lowercase using built-in method: " + builtIn);
        System.out.println("Text converted to lowercase using user-defined method: " + userDefined);
        System.out.println("Are both methods giving the same result? " + areEqual);
    }
}
