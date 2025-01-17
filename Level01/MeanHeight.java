//importing scanner class from util package
import java.util.Scanner;
//create MeanHeight class
public class MeanHeight
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//create a double array named heights of size 11 
        double[] heights = new double[11];
		//create a variable to store thr sum value and initialize it to zero
        double sum = 0.0;

        //create for loop to input height
        for (int i = 0; i < heights.length; i++) 
		{
			//taking user input
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
			//adding heights
            sum += heights[i];
        }

        //calculate mean height
        double meanHeight = sum / heights.length;
		//print the output
        System.out.println("Mean height of the football team: " + meanHeight);
    }
}