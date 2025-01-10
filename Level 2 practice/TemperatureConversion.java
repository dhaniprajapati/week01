// Import the Scanner class from the util package
import java.util.Scanner;

// Class for temperature conversion
public class TemperatureConversion {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result in a clear format
        System.out.printf("The temperature %.2f°C is equivalent to %.2f°F.%n", celsius, fahrenheit);

        // Close the Scanner object
        input.close();
    }
}
