import java.util.Scanner;

public class PalindromeCheck 
{
    //check if the text is a palindrome using a loop
    public static boolean isPalindromeIterative(String text) 
    {
        int start = 0; // start index
        int end = text.length() - 1; // end index
        while (start < end) 
        {
            if (text.charAt(start) != text.charAt(end)) 
            {
                return false; // characters do not match
            }
            start++;
            end--;
        }
        return true; // all characters match
    }
    // check if the text is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) 
    {
        if (start >= end) 
        {
            return true; // base case: start index is greater than or equal to end index
        }
        if (text.charAt(start) != text.charAt(end)) 
        {
            return false; // characters do not match
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // recursive call
    }
    //check if the text is a palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) 
    {
        char[] originalArray = text.toCharArray(); // convert string to character array
        char[] reverseArray = reverseStringUsingCharArray(text); // get the reversed array

        // compare characters in original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) 
        {
            if (originalArray[i] != reverseArray[i]) 
            {
                return false; // characters do not match
            }
        }
        return true; // all characters match
    }
    //method to reverse a string using charAt() method
    public static char[] reverseStringUsingCharArray(String text) 
    {
        int length = text.length();
        char[] reverseArray = new char[length];

        for (int i = 0; i < length; i++) 
        {
            reverseArray[i] = text.charAt(length - 1 - i); // fill the reverse array
        }
        return reverseArray;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        // check for palindrome using the three logics
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultCharArray = isPalindromeUsingCharArray(text);
        // print the results
        System.out.println("Palindrome check using iteration: " + resultIterative);
        System.out.println("Palindrome check using recursion: " + resultRecursive);
        System.out.println("Palindrome check using character arrays: " + resultCharArray);

        scanner.close();
    }
}
