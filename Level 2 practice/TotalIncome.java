import java.util.Scanner;

// Class to calculate total income
public class TotalIncome {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for salary input
        System.out.print("Enter the salary in INR: ");
        double salary = input.nextDouble();

        // Prompt the user for bonus input
        System.out.print("Enter the bonus in INR: ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                           ". Hence, Total Income is INR " + totalIncome);

        // Close the Scanner object
        input.close();
    }
}
