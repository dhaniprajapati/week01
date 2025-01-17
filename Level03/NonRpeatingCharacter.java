import java.util.Scanner;

public class NonRepeatingCharacter
{
    // method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text)
    {
        int[] charFrequency = new int[256];  // array to store frequency of characters (ASCII size is 256)

        // loop to calculate frequency of each character in the text
        for (int i = 0; i < text.length(); i++)
        {
            charFrequency[text.charAt(i)]++;  // increment frequency of the character
        }
        // loop to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++)
        {
            if (charFrequency[text.charAt(i)] == 1)
            {
                return text.charAt(i);  // return the first non-repeating character
            }
        }
        return '\0';  // return null character if no non-repeating character is found
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();  // get the input text from the user
        // call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // print the result
        if (result != '\0')
        {
            System.out.println("The first non-repeating character is: " + result);
        }
        else
        {
            System.out.println("No non-repeating character found in the string.");
        }

        scanner.close();  // close the scanner
    }
}
