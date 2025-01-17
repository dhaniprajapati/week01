import java.util.Scanner;
import java.util.Random;

public class VotingEligibilityString
{
    // Method to generate random ages of students
    public static int[] generateAges(int n)
    {
        Random ran = new Random();
        int[] ages = new int[n];
        // Generate random ages (between 10 and 99)
        for (int i = 0; i < n; i++)
        {
            ages[i] = ran.nextInt(90) + 10;  // Generates numbers between 10 and 99
        }
        return ages;
    }
    // Method to check whether the student can vote or not
    public static String[][] checkVotingEligibility(int[] ages)
    {
        String[][] result = new String[ages.length][2];  // create 2D array to store age and voting status

        // run loop through the ages array and check voting eligibility
        for (int i = 0; i < ages.length; i++)
        {
            if (ages[i] < 0)
            {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid Age"; 
            }
            else if (ages[i] >= 18)
            {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote"; 
            }
            else
            {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote"; 
            }
        }
        return result;
    }
    // Method to display the results in a tabular format
    public static void displayResults(String[][] result)
    {
        //print the table header
        System.out.println("Age                  Voting Eligibility");
        System.out.println("---------------------------------------");

        // run loop to print each student's age and eligibility
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i][0] + "                    " + result[i][1]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // create variable the number of students and assign value 10
        final int numOfStudents = 10;

        // Generate random ages for 10 students
        int[] studentAges = generateAges(numOfStudents);

        // call the method
        String[][] eligibilityResults = checkVotingEligibility(studentAges);

        // print the results
        displayResults(eligibilityResults);

        sc.close();  // Close the scanner
    }
}
