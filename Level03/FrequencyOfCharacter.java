import java.util.Scanner;

public class FrequencyOfCharacter
{
    // method to find unique characters in a string
    public static char[] findUniqueCharacters(String text)
    {
        int length = text.length();
        char[] uniqueChars = new char[length];  // array to store unique characters
        int uniqueCount = 0;

        // loop to find unique characters
        for (int i = 0; i < length; i++)
        {
            char currentChar = text.charAt(i);  // get the current character
            boolean isUnique = true;

            // inner loop to check if the character is already found 
            for (int j = 0; j < uniqueCount; j++)
            {
                if (uniqueChars[j] == currentChar)
                {
                    isUnique = false; 
                    break;
                }
            }
            // if unique, add it to the uniqueChars array
            if (isUnique)
            {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // create an array of exact size to hold unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    // method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text)
    {
        char[] uniqueChars = findUniqueCharacters(text);  // get unique characters
        int[] charFrequency = new int[256];  // array to store frequency of characters

        // loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++)
        {
            charFrequency[text.charAt(i)]++;  // increment frequency
        }
        // create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        // loop to store unique characters and their frequencies in the result array
        for (int i = 0; i < uniqueChars.length; i++)
        {
            result[i][0] = String.valueOf(uniqueChars[i]);  // store character
            result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);  // store frequency
        }
        return result;  // return the 2D array
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();  // get the input text from the user
        // call the method to find character frequencies
        String[][] frequencyResult = findCharacterFrequency(inputText);
        // display the result
        System.out.println("Character frequencies:");
        for (String[] entry : frequencyResult)
        {
            System.out.println(entry[0] + " -> " + entry[1]);  // display character and its frequency
        }
        scanner.close();  // close the scanner
    }
}
