//importing scanner class from util package
import java.util.Scanner;

public class VoteEligibalityMethod 
{

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) 
	{
        //check if the age is greater than 0 not and return false
        if (age < 0) {
            return false; 
        }
		//return true if age is 18 or above
        return age >= 18; 
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//create array to store ages of 10 students
        int[] ages = new int[10]; 

        //run for loop to take user input for ages
        for (int i = 0; i < ages.length; i++) 
		{
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        //use for loop and check if student can vote or not
        for (int age : ages) 
		{
            if (canStudentVote(age)) 
			{
                System.out.println("Student is of " + age + " years, so they can vote.");
            } 
			else 
			{
                System.out.println("Student is of " + age + " years, so they cannot vote.");
            }
        }

        scanner.close();
    }
}