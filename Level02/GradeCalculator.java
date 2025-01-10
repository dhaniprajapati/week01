//importing scanner class from util package
import java.util.Scanner;
//create a class GradeCalculator
public class GradeCalculator
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);
		//taking input from user
		System.out.print("Enter marks of Physics: ");
        double physics = input.nextDouble();

        System.out.print("Enter marks of Chemistry: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter marks of Mathematics: ");
        double mathematics = input.nextDouble();

        //create variables and calculate average and percentage
        double totalMarks = physics + chemistry + mathematics;
        double averageMarks = totalMarks / 3.0;
        double percentage = (totalMarks / 300.0) * 100;

        //determining grade and remarks
        String grade, remarks;
		//using if else statement to determine the grade and remarks
        if (percentage >= 80) 
		{
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        //print the results
        System.out.println("\n--- Results ---");
        System.out.printf("Average Marks: "+ averageMarks);
        System.out.printf(" Percentage: "+ percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}