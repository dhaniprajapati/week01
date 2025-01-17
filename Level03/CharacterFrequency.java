import java.util.Scanner;

public class CharacterFrequency
{
    // method to find the frequency of characters in a string
    public static char[][] findCharacterFrequency(String text)
    {
        int[] charFrequency = new int[256];  // array to store frequency of characters (ASCII size is 256)

        // loop to calculate frequency of each character in the text
        for (int i = 0; i < text.length(); i++)
        {
            charFrequency[text.charAt(i)]++;  // increment frequency of the character
        }

        // calculate the number of unique characters in the string
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++)
        {
            if (charFrequency[i] > 0)
            {
                uniqueCount++;
            }
        }

        // create a 2D array to store characters and their frequencies
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        // loop to store characters and their frequencies
        for (int i = 0; i < 256; i++)
        {
            if (charFrequency[i] > 0)
            {
                result[index][0] = (char) i;  // store the character
                result[index][1] = (char) charFrequency[i];  // store the frequency
                index++;
            }
        }

        return result;  // return the 2D array with characters and their frequencies
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();  // get the input text from the user

        // call the method to find character frequencies
        char[][] frequencyResult = findCharacterFrequency(inputText);

        // print the result
        System.out.println("Character frequencies:");
        for (char[] entry : frequencyResult)
        {
            System.out.println(entry[0] + " -> " + (int) entry[1]);  
        }

        scanner.close();  // close the scanner
    }
}
