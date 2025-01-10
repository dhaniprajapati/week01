// Import the Scanner class from the util package
import java.util.Scanner;

// Create DistanceCoveredByAthlete class
public class DistanceCoveredByAthlete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs for the sides of the triangle
        System.out.println("Enter the length of side 1 in meters:");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of side 2 in meters:");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of side 3 in meters:");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters (5000 meters)
        double distanceInMeters = 5000;

        // Calculate the number of rounds
        double rounds = distanceInMeters / perimeter;

        // Print result with formatted output
        System.out.printf("The total number of rounds the athlete will run to complete 5 km is: ", rounds);

        // Close the Scanner object
        input.close();
    }
}
