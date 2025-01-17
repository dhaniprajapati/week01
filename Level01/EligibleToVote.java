//importing scanner class from util package
import java.util.Scanner;
//create EligibileToVote class
public class EligibileToVote
{
    public static void main(String[] args) 
	{
		//array to store ages of the 10 students
        int[] ages = new int[10]; 
        Scanner scanner = new Scanner(System.in);

        //running for loop for taking input for the ages
        for (int i = 0; i < ages.length; i++) 
		{
			//taking user input for age of students 
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        //run for loop for checking eligibility and displaying results
        for (int i = 0; i < ages.length; i++) 
		{
			//checking if the age entered by the student is vaild or not
            if (ages[i] < 0) 
			{
				//print invalid if the age is less than 0
                System.out.println("Invalid age entered for student " + (i + 1));
            } 
			else if (ages[i] >= 18) 
			{
				//print result if the age is greater than equal to 18 and can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
			else 
			{
				//print result if the age is smaller than 18 and cannot vote
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}
