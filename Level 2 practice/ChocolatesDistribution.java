// Import the Scanner class from the util package
import java.util.Scanner;

// Class to distribute chocolates
public class ChocolatesDistribution {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Take the integer values from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Check if there are any children
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Calculate chocolates per child
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;

            // Calculate remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Print the output
            System.out.println("Each child gets " + chocolatesPerChild + " chocolates.");
            System.out.println("Remaining chocolates: " + remainingChocolates);
        }

        // Close the Scanner object
        input.close();
    }
}
