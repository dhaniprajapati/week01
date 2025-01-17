import java.util.Scanner;

public class WordSplitWithLength
{
   // method to calculate the length of the string without using length() method
    public static int calculateLength(String str) 
	{
		// create a variable and initialize count to 0
        int count = 0; 
        try 
		{
			//run infinite loop
            while (true) 
			{
                str.charAt(count); //to access each character
                count++; //increment counter
            }
        } 
		catch (IndexOutOfBoundsException e) 
		{
            //exception indicates the end of the string
        }
        return count; //return the final count
    }
    // method to split the text into words without using split() method
    public static String[] splitText(String text) 
    {
		// to calculate the length of the string
        int length = calculateLength(text);
		// create and initialize word count to 0
        int wordCount = 0;
		// array to store index(space between text)
        int[] index = new int[length]; 

        // loop to find index(space brtween text)
        for (int i = 0; i < length; i++) 
        {
            if (text.charAt(i) == ' ') 
            {
                index[wordCount] = i; // store index(space)
                wordCount++; //increment word count
            }
        }
        // create array to store words
        String[] words = new String[wordCount + 1];
		// starting index of a word
        int start = 0;
        //run loop to get words
        for (int i = 0; i < wordCount; i++) 
        {
            int end = index[i]; //ending index of the word
            words[i] = text.substring(start, end); //extract word
            start = end + 1; // update start index
        }
        // to add the last word
        words[wordCount] = text.substring(start, length);
        return words; // return the array of words
    }
	// Method to generate a 2D array with words and their lengths
    public static String[][] getWordsWithLength(String[] words) 
	{
		// 2D array to store words and lengths
        String[][] result = new String[words.length][2]; 
        //using for loop to store  word and length pairs in the 2D array
        for (int i = 0; i < words.length; i++) 
		{
            result[i][0] = words[i]; // Word at column 0
            result[i][1] = String.valueOf(calculateLength(words[i])); // Length at column 1 converted to string
        }
		return result;
	}
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // take user input for the text
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // split text using user defined method
        String[] userDefined = splitText(inputText);

        // split text using built-in split() method
        String[] builtIn = inputText.split(" ");
		
		// generate a 2D array with words and lengths using the user-defined method
        String[][] userDefinedWithLength = getWordsWithLength(userDefined);
		
        //print the results
        System.out.println("\nWords with Lengths using user defined method:");
        for (int i = 0; i < userDefinedWithLength.length; i++) 
		{
            System.out.println(userDefinedWithLength[i][0] + " - Length: " + Integer.parseInt(userDefinedWithLength[i][1]));
        }
        sc.close(); // close the scanner
    }
}
