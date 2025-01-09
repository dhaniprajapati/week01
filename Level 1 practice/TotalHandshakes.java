//import scanner class from util package
import java.util.Scanner;
//create TotalHandshakes class
public class TotalHandshakes
{
    public static void main(String[] args) 
	{
        //initialize scanner class object
        Scanner input = new Scanner(System.in);
		//taking user input
		System.out.print("Number of Students:");
		
		int numberOfStudents = input.nextInt();
		int numberOfPossibleHandshakes=  (numberOfStudents * (numberOfStudents - 1) / 2);
		System.out.print("Number of possible handshakes:"+numberOfPossibleHandshakes );
		input.close();
	}
}

		