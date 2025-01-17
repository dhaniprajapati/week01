import java.util.Scanner;

public class FindShortestAndLongest
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
    //method to find shortest and longest string
	public static void findShortestAndLongest(String[] words)
	{
		String shortest = words[0];
        String longest = words[0];
		// Loop to find the shortest and longest words
		for (String word : words)
		{
        if (calculateLength(word) < calculateLength(shortest))
        {
            shortest = word;
        }
        if (calculateLength(word) > calculateLength(longest))
        {
            longest = word;
        }
    }

    //print the results
    System.out.println("Shortest word: " + shortest + " (Length: " + calculateLength(shortest) + ")");
    System.out.println("Longest word: " + longest + " (Length: " + calculateLength(longest) + ")");
	}
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // take user input for the text
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // split text using user defined method
        String[] userDefined = splitText(inputText);

        //print the results
        System.out.println("\nWords using user defined method:");
        for (String word : userDefined) 
        {
            System.out.println(word);
        }
        // Find and display the shortest and longest words
        findShortestAndLongest(userDefined);

        sc.close(); // close the scanner
    }
}
