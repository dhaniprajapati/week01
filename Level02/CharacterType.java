import java.util.Scanner;

public class CharacterType
{
    // method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch)
    {
        // convert character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        // check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            return "Vowel";
        }
        // check if the character is a consonant
        else if ((ch >= 'a' && ch <= 'z'))
        {
            return "Consonant";
        }
        else
        {
            return "Not a Letter"; // return if it's not a letter
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // take user input for the character
        System.out.print("Enter a string: ");
		// take the first character from the input
        char ch = sc.next().charAt(0); 
        // check the character type using the user-defined method
        String result = checkCharacterType(ch);
        //print the result
        System.out.println("Character: " + ch + " is a " + result);
        sc.close(); // close the scanner
    }
}
