//import scanner class from util package
import java.util.Scanner;
//create HandshakesMethod class
public class HandshakesMethod
{
	//initialize method to calculate total numbers of handshakes 
	public static int CalculateTotalHandshakes(int n)
	{
		return (n * (n - 1)) / 2;
	}
    public static void main(String[] args) 
	{
        //initialize scanner class object
        Scanner input = new Scanner(System.in);
		//taking user input
		System.out.print("Number of Students:");
		int numberOfStudents = input.nextInt();
		int numberOfPossibleHandshakes= CalculateTotalHandshakes(numberOfStudents);
		System.out.print("Number of possible handshakes:"+numberOfPossibleHandshakes );
		input.close();
	}
}
