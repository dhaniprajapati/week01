import java.util.Scanner;

public class CharacterFrequencyNestedLoops
{
    // method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text)
    {
        char[] characters = text.toCharArray();  // convert the string to a character array
        int[] frequencies = new int[characters.length];  // array to store frequency of each character
        // outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++)
        {
            if (characters[i] == '0')  // skip characters already marked as counted
            {
                continue;
            }
            frequencies[i] = 1;  // initialize the frequency of the current character to 1
            // inner loop to check for duplicate characters
            for (int j = i + 1; j < characters.length; j++)
            {
                if (characters[i] == characters[j])
                {
                    frequencies[i]++;  // increment the frequency
                    characters[j] = '0';  // mark the duplicate character as counted
                }
            }
        }
        // count non-zero frequencies to determine the size of the result array
        int uniqueCount = 0;
        for (int frequency : frequencies)
        {
            if (frequency > 0)
            {
                uniqueCount++;
            }
        }
        // create a 1D array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        // populate the result array with characters and their frequencies
        for (int i = 0; i < characters.length; i++)
        {
            if (frequencies[i] > 0)
            {
                result[index] = characters[i] + " -> " + frequencies[i];  // store the character and frequency
                index++;
            }
        }
        return result;  // return the result array
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // create a scanner object to take input from the user

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();  // get the input text from the user

        // call the method to find character frequencies
        String[] frequencyResult = findCharacterFrequency(inputText);
        // print the result
        System.out.println("Character frequencies:");
        for (String entry : frequencyResult)
        {
            System.out.println(entry);  // display character and its frequency
        }
        scanner.close();  // close the scanner
    }
}
