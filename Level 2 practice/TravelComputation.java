//import scanner class from util package
import java.util.Scanner;
//create TravelComputation class

public class TravelComputation
{

    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter name:");
        String name = input.nextLine();

        System.out.println("Enter the starting city:");
        String fromCity = input.nextLine();

        System.out.println("Enter the via city:");
        String viaCity = input.nextLine();

        System.out.println("Enter the destination city:");
        String toCity = input.nextLine();

        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles:");
        double distanceFromToVia = input.nextDouble();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles:");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.println("Enter the time taken for the journey:");
        double timeTaken = input.nextDouble();

        // Calculate total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Print the results
        System.out.println("\nTravel Summary for " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");

        //close the scanner
        input.close();
    }
}