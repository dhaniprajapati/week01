// Import the Scanner class from the util package
import java.util.Scanner;

// Create DistanceCoveredByAthleteMethod class
public class DistanceCoveredByAthleteMethod
{
	//initialize method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) 
	{
        //calculate the perimeter by adding all three sides and return the result
        return side1 + side2 + side3;
    }
	//initialixe method to calculate the number of rounds needed to complete 5 km
    public static double calculateRounds(double perimeter) 
	{
        //converting 5km in meters
		double distanceToRun = 5000; 
        //calculate the number of rounds by dividing the distance by the perimeter
        return distanceToRun / perimeter;
    }
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        //taking user inputs for sides of triangle
        System.out.println("Enter the length of side 1 in meters:");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of side 2 in meters:");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of side 3 in meters:");
        double side3 = input.nextDouble();

        //call the method to calculate the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        //call the method to calculate the number of rounds
        double rounds = calculateRounds(perimeter);

        //print the result
        System.out.printf("The total number of rounds the athlete will run to complete 5 km is: "+rounds);

        //close the Scanner object
        input.close();
    }
}
