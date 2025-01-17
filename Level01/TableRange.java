//importing scanner class util package
import java.util.Scanner;
//create TableRange class
public class TableRange 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//taking user input
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
		//cfeate integer array to store the multiplication result
        int[] multiplicationResult = new int[4];

        //calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) 
		{
            multiplicationResult[i - 6] = number * i;
        }

        //print the result
        for (int i = 0; i < multiplicationResult.length; i++) 
		{
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}