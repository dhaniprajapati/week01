import java.util.Scanner;

public class BMICalculator
{
    // method to calculate BMI and status
    public static String[] calculateBMIAndStatus(double weight, double height)
    {
        // convert height from cm to meters
        height = height / 100;
        
        // calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        
        // determine BMI status based on BMI value
        String status = "";
        if (bmi <= 18.4)
        {
            status = "Underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            status = "Normal";
        }
        else if (bmi >= 25.0 && bmi <= 39.9)
        {
            status = "Overweight";
        }
        else
        {
            status = "Obese";
        }
        
        // return the BMI and status as a string array
        return new String[] {String.format("%.2f", bmi), status};
    }
    // method to compute BMI and status for all individuals
    public static String[][] computeBMIAndStatus(double[][] teamData)
    {
        String[][] result = new String[teamData.length][4];
        
        for (int i = 0; i < teamData.length; i++)
        {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            
            // calculate BMI and status
            String[] bmiAndStatus = calculateBMIAndStatus(weight, height);
            
            // store the result: weight, height, BMI, and status
            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", height);
            result[i][2] = bmiAndStatus[0]; // BMI
            result[i][3] = bmiAndStatus[1]; // Status
        }
        
        return result;
    }
    // method to display the 2D array in tabular format
    public static void displayResult(String[][] result)
    {
        // display table header
        System.out.println("Person | Height (cm) | Weight (kg) | BMI   | Status");
        System.out.println("--------------------------------------------------------");
        
        // display the data for each person
        for (int i = 0; i < result.length; i++)
        {
            System.out.println((i + 1) + " | " + result[i][1] + " | " + result[i][0] + " | " + result[i][2] + " | " + result[i][3]);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);       
        // 2D array to store weight (kg) and height (cm) for each person
        double[][] teamData = new double[10][2];       
        // take user input for height and weight of 10 people
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }
        // compute BMI and status for all team members
        String[][] result = computeBMIAndStatus(teamData);

        // print the results
        displayResult(result);

        scanner.close();
    }
}
