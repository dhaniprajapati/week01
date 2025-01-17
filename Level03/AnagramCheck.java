import java.util.Scanner;

public class AnagramCheck 
{
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) 
    {
        // Check if lengths of the texts are equal
        if (text1.length() != text2.length()) 
        {
            return false;
        }
        //Create frequency arrays for the characters in both texts
        int[] frequency1 = new int[26]; // For first text
        int[] frequency2 = new int[26]; // For second text
        //Calculate the frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) 
        {
            // Convert characters to lowercase to handle case insensitivity
            char char1 = Character.toLowerCase(text1.charAt(i));
            char char2 = Character.toLowerCase(text2.charAt(i));

            // Increment frequency only for alphabetic characters
            if (Character.isLetter(char1)) 
            {
                frequency1[char1 - 'a']++;
            }
            if (Character.isLetter(char2)) 
            {
                frequency2[char2 - 'a']++;
            }
        }
        // Compare the frequencies of characters in both texts
        for (int i = 0; i < 26; i++) 
        {
            if (frequency1[i] != frequency2[i]) 
            {
                return false;
            }
        }
        return true; // If all frequencies match, the texts are anagrams
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();
        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);
        // print the result
        if (result) 
        {
            System.out.println("The texts are anagrams.");
        } 
        else 
        {
            System.out.println("The texts are not anagrams.");
        }
        scanner.close();
    }
}
