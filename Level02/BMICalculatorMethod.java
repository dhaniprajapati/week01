//importing scanner class from util package
import java.util.Scanner;

public class BMICalculatorMethod
{

    //initialize method to calculate BMI
    public static void calculateBMI(double[][] data) 
	{
        for (int i = 0; i < data.length; i++) {
            //convert height from cm to meters
            double heightInMeters = data[i][1] / 100.0;
            //calculate BMI using the formula
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    //initialize method to determine BMI status
    public static String[] determineStatus(double[][] data) 
	{
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) 
		{
            double bmi = data[i][2];
            //check the bmi status using if else statement
            if (bmi <= 18.4)
			{
                status[i] = "Underweight";
            } 
			else if (bmi <= 24.9) 
			{
                status[i] = "Normal";
            } 
			else if (bmi <= 39.9) 
			{
                status[i] = "Overweight";
            } 
			else 
			{
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        //take user input for weight and height
        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        //call method to calculate BMI for each person
        calculateBMI(data);

        //BMI status for each person
        String[] status = determineStatus(data);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
             System.out.println(data[i][0] + "    " + data[i][1] + "      " + data[i][2] + "      " + status[i]);
        }
        scanner.close();
    }
}
