//importing scanner class from util package
import java.util.Scanner;

public class FriendsHeightAgeMethod 
{

    //initialize method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) 
	{
		//create a variable and assign value 0
        int minAgeIndex = 0;
		//run for loop to find the youngest friend
        for (int i = 1; i < ages.length; i++) 
		{
            if (ages[i] < ages[minAgeIndex]) 
			{
				 //change the minAgeIndex if the younger friend is found
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    //initialize method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) 
	{
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) 
		{
            if (heights[i] > heights[maxHeightIndex]) 
			{
                maxHeightIndex = i; 
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //create string array and input name of friends
        String[] names = {"Amar", "Akbar", "Anthony"};
		 //array to store ages
        int[] ages = new int[3];
		 //array to store heights
        double[] heights = new double[3];

        //run for loop to take user input
        for (int i = 0; i < names.length; i++) 
		{
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        //call method to calculate and print result
        String youngest = findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngest);

        String tallest = findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close(); 
    }
}