//importing scanner class from util package
import java.util.Scanner;
//Create RocketLaunchCountdown class
public class RocketLaunchCountdown
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input= new Scanner(System.in);
		//Taking user input
		System.out.print("Enter the starting value of Countdown: ");
		int counterValue = input.nextInt();
		// using for loop in decrement to perform countdown for launch
		for(int i=0;counterValue>=0;i++)
		{
			System.out.print(" " +counterValue);
			counterValue= counterValue-1;
		}
		
        // Print the launch message
        System.out.print("Liftoff! The rocket has launched!");
        
        input.close();
    }
}

		