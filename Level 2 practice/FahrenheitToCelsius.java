// Import the Scanner class from the util package
import java.util.Scanner;

// Class to convert Fahrenheit to Celsius
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusResult + " Celsius");

        // Close the Scanner object
        input.close();
    }
}
