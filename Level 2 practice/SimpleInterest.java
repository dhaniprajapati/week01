//import scanner class from util package
import java.util.Scanner;
//Create SimpleInterest class
public class SimpleInterest 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();


        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();
	
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
		// Create a variable
        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + 
            " for Principal " + principal + 
            ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        // Close the scanner
        input.close();
    }
}
