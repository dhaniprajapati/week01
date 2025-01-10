//importing scanner class from util package
import java.util.Scanner;
//Create LaunchCountdown class 
public class LaunchCountdown
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting inputs from the user
        System.out.print("Enter the starting value for the countdown: ");
        int counter = input.nextInt();

        // Performing the countdown for launch using while loop in decrement
        System.out.print("Starting countdown: ");
        while (counter >= 1) 
		{
            System.out.print(counter+ "  " );
            counter= counter-1; 
        }

        // Print the launch message
        System.out.print(" Liftoff! The rocket has launched!");
        
        input.close();
    }
}
