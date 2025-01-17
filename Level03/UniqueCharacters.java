import java.util.Scanner;

public class UniqueCharacters
{
    // method to find the length of the text
    public static int getStringLength(String text)
    {
        int length = 0;
        try
        {
            while (true)
            {
                text.charAt(length);  // accessing each character in the string
                length++;  // increment the length for each character
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            return length;  // return the length when the exception occurs
        }
    }
    // method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text)
    {
        int length = getStringLength(text);  // get the length of the string
        char[] uniqueChars = new char[length];  // array to store unique characters
        int uniqueCount = 0;
        // loop to find unique characters
        for (int i = 0; i < length; i++)
        {
            char currentChar = text.charAt(i);  // get the current character from the string
            boolean isUnique = true;

            // inner loop to compare with previous characters
            for (int j = 0; j < i; j++)
            {
                if (text.charAt(j) == currentChar)
                {
                    isUnique = false;  // if the character is found before, it's not unique
                    break;  // exit the inner loop as we found the duplicate
                }
            }

            // if the character is unique, add it to the result array
            if (isUnique)
            {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;  // increment the count of unique characters
            }
        }
        // create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++)
        {
            result[i] = uniqueChars[i];  // copy unique characters into the result array
        }

        return result;  // return the unique characters array
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // find unique characters in the input string
        char[] uniqueCharacters = findUniqueCharacters(inputText);

        // print the unique characters
        System.out.println("Unique characters in the string: ");
        for (char c : uniqueCharacters)
        {
            System.out.print(c + " "); 
        }
        scanner.close();  // close the scanner
    }
}
