//import scanner class from util package
import java.util.Scanner;
// Create WeightConverter class
public class WeightConverter 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the weight: ");
        double weightInPounds = input.nextDouble();
		// Create a variable 
        // Convert weight to kilogram
		//1 pound = 2.2 KG
        double weightInKilograms = weightInPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
            " and in kilograms is " + weightInKilograms);

        // Close the scanner
        input.close();
    }
}
