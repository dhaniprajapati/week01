//import the Scanner class from util package
import java.util.Scanner;

public class WindChillCalculatorMethod 
{

    //initialize static method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) 
	{
        // Wind chill formula and return the result
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        //call the method to calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // print the output
        System.out.println("The wind chill temperature is: " + windChill + "°F");

        scanner.close();
    }
}