//importing scanner class from util package
import java.util.Scanner;
//create Copy2DTo1D class
public class Copy2DTo1D
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//taking input from user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        //create a 2D array
        int[][] matrix = new int[rows][columns];

        //taking user input values for the 2D array
        System.out.println("Enter elements of the matrix:");
		//create for loop to store the values of rows
        for (int i = 0; i < rows; i++) 
		{
			//create for loop to store the values of rows
            for (int j = 0; j < columns; j++) 
			{
                matrix[i][j] = scanner.nextInt();
            }
        }

        //create a 1D array to copy elements
        int[] oneDArray = new int[rows * columns];
		//create a variable to store index value and initialize it to 0.
        int index = 0;

        //copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        //Print the 1D array
        System.out.print("1D Array: ");
        for (int value : oneDArray) 
		{
            System.out.print(value + " ");
        }
        System.out.println();
    }
}