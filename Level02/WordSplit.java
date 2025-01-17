import java.util.Scanner;

public class WordSplit 
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
    // method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) 
    {
        if (arr1.length != arr2.length) 
        {
            return false;
        }
        // run loop to compare each word in the arrays
        for (int i = 0; i < arr1.length; i++) 
        {
            if (!arr1[i].equals(arr2[i])) 
            {
                return false;
            }
        }
        return true; 
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

        // compare the two arrays
        boolean areEqual = compareArrays(userDefined, builtIn);

        //print the results
        System.out.println("\nWords using user defined method:");
        for (String word : userDefined) 
        {
            System.out.println(word);
        }
        System.out.println("\nWords using built-in split() method:");
        for (String word : builtIn) 
        {
            System.out.println(word);
        }
        System.out.println("\nAre both methods giving the same result? " + areEqual);

        sc.close(); // close the scanner
    }
}
