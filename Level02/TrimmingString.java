import java.util.Scanner;

public class TrimmingString
{
    // Method to find the starting and ending index without leading and trailing spaces
    public static int[] findTrimmedIndices(String text)
    {
        int start = 0, end = text.length() - 1;
        // Find the start index (skip leading spaces)
        while (start <= end && text.charAt(start) == ' ')
        {
            start++;
        }
        // Find the end index (skip trailing spaces)
        while (end >= start && text.charAt(end) == ' ')
        {
            end--;
        }
        // Return the index as an array [start, end]
        return new int[] { start, end };
    }
    // Method to create a substring using charAt()
    public static String createSubstring(String text, int indexFirst, int indexLast)
	{
		String subString= " ";
		for(int i=indexFirst; i< indexLast;i++)
		{
			subString+=text.charAt(i);
		}
		return subString;
	}
    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false; // If lengths are different, they are not equal
        }

        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                return false; // If characters at any position differ, strings are not equal
            }
        }

        return true; // Strings are identical
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputText = sc.nextLine();

        // Trim the string using charAt() method
        int[] trimmedIndices = findTrimmedIndices(inputText);
        String trimmedText = createSubstring(inputText, trimmedIndices[0], trimmedIndices[1]);

        // Trim the string using built-in trim() method
        String builtInTrimmedText = inputText.trim();

        // Compare both trimming methods
        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display results
        System.out.println("\nTrimmed text using charAt() method: '" + trimmedText + "'");
        System.out.println("Trimmed text using built-in trim() method: '" + builtInTrimmedText + "'");
        System.out.println("\nAre both trimming methods giving the same result? " + areEqual);

        sc.close(); // Close the scanner
    }
}
