import java.util.Scanner;
// create StudentGrades2D class 
public class StudentGrades2D 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        //create a 2D array to store marks for Physics, Chemistry, and Maths
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        //create loop to take input for marks of students in Physics, Chemistry, and Maths
        for (int i = 0; i < numberOfStudents; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double mark;
                do 
				{
                    System.out.print("Enter marks for " + subject + " for student " + (i + 1) + ": ");
                    mark = scanner.nextDouble();
                    if (mark < 0) 
					{
                        System.out.println("Please enter a positive value for marks.");
                    }
                } 
				while (mark < 0);
                marks[i][j] = mark; //store the marks
            }
            //calculate the percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            //determine the grade based on the percentage
            if (percentages[i] >= 80) 
			{
                grades[i] = "A";
            } 
			else if (percentages[i] >= 70) 
			{
                grades[i] = "B";
            } 
			else if (percentages[i] >= 60) 
			{
                grades[i] = "C";
            } 
			else if (percentages[i] >= 50) 
			{
                grades[i] = "D";
            } 
			else if (percentages[i] >= 40) 
			{
                grades[i] = "E";
            } 
			else 
			{
                grades[i] = "R"; 
            }
        }
		//print result
        for (int i = 0; i < numberOfStudents; i++) 
		{
            System.out.println((i + 1)+" "+ marks[i][0]+" "+ marks[i][1]+" "+ marks[i][2]+" "+percentages[i]+" "+grades[i]);
        }
        // Close the scanner
        scanner.close();
    }
}