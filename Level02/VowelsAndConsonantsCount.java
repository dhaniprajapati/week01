import java.util.Scanner;

public class VowelsAndconsonantsCount
{
    // Method to check if a character is a vowel or consonant
    public static String checkCharacter(char ch)
    {
        // Convert character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            return "Vowel";
        }
        // Check if the chharacter is a consonant
        else if ((ch >= 'a' && ch <= 'z'))
        {
            return "Consonant";
        }
        else
        {
            return "Not a Letter"; // Return if it's not a letter
        }
    }
    // Method to find vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String str)
    {
        int vowel = 0;
        int consonant = 0;

        // Loop through the string to count vowels and consonants
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            // Check if character is a vowel or consonant
            String result = checkCharacter(ch);
            if (result.equals("Vowel"))
            {
                vowel++; // Increment in vowels count
            }
            else if (result.equals("Consonant"))
            {
                consonant++; // Increment in consonants count
            }
        }
        // Return counts in an array [vowel, consonant]
        return new int[] { vowel, consonant };
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Take user input for the text
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();
        // Call the method to find vowels and consonants
        int[] result = findVowelsAndConsonants(inputText);

        // Print the result
        System.out.println("Vowels count: " + result[0]);
        System.out.println("Consonants count: " + result[1]);

        sc.close(); // Close the scanner
    }
}
