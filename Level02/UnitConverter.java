import java.util.Scanner;

public class UnitConverter {

    //initalize method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    //initalize method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    //initalize method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    //initalize method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    //initalize method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		//taking user input for choice
        System.out.println("Choose a conversion type:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();
		//taking user input for value 
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        double result;

        if (choice == 1) {
            result = convertYardsToFeet(value);
            System.out.println("Result: " + result + " feet");
        } else if (choice == 2) {
            result = convertFeetToYards(value);
            System.out.println("Result: " + result + " yards");
        } else if (choice == 3) {
            result = convertMetersToInches(value);
            System.out.println("Result: " + result + " inches");
        } else if (choice == 4) {
            result = convertInchesToMeters(value);
            System.out.println("Result: " + result + " meters");
        } else if (choice == 5) {
            result = convertInchesToCentimeters(value);
            System.out.println("Result: " + result + " cm");
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
