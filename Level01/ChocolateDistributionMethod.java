 //import the Scanner class from util package
import java.util.Scanner;

public class ChocolateDistributionMethod 
{

    //initialize method 
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) 
	{
		//create variables to store chocolatesPerChild and remaining chocolates
        int chocolatesPerChild = 0;
        int remainingChocolates = 0;

        //check if the number of children is greater than 0 or not
        if (numberOfChildren > 0) 
		{
            chocolatesPerChild = numberOfChocolates / numberOfChildren;
            remainingChocolates = numberOfChocolates % numberOfChildren;
        } 
		else 
		{
            System.out.println("Number of children must be greater than 0.");
        }

        //return the results in an array
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Prompt the user to enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        //call the method distribute chocolates
        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

        //print the results
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }
}