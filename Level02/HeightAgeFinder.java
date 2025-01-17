import java.util.Scanner;
//create HeightAgeFinder class
public class HeightAgeFinder
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);      
        //create array to store names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
		//create arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        //use for loop to input ages and heights for the friends
        for (int i = 0; i < friends.length; i++) 
		{
			//taking user input
            System.out.println("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        //create variables to store the youngest and tallest and initialize it to 0
        int youngestIndex = 0;
        double tallestIndex = 0;
        //use foor loop to find the youngest and tallest
        for (int i = 1; i < friends.length; i++) 
		{
			//comparing the ages of friends to find the youngest
            if (ages[i] < ages[youngestIndex]) 
			{
                youngestIndex = i;
            }
			//comparing the height of friends to find the tallest
            if (heights[i] > heights[(int)tallestIndex]) 
			{
                tallestIndex = i;
            }
        }
        //print the results
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[(int)tallestIndex] + " with height " + heights[(int)tallestIndex] + " cm.");
        // Close the scanner
        scanner.close();
    }
}