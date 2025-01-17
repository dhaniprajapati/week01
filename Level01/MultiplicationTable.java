//importing scanner class from util package
import java.util.Scanner;
//create MultiplicationTable class 
public class MultiplicationTable 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//initializing array 
		int[] Table = new int[10];
		//taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        //run for loop to calculate multiplication table
        for (int i = 1; i <= 10; i++) 
		{
            Table[i - 1] = number * i;
        }

        //using for loop to display the multiplication table
        for (int i = 0; i < Table.length; i++) 
		{
            System.out.println(number + " * " + (i + 1) + " = " + Table[i]);
        }
		scanner.close();
    }
}