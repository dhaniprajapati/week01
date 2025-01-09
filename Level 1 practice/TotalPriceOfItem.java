//import scanner class from util package
import java.util.Scanner;
//create TotalPriceOfItem class
public class TotalPriceOfItem
{
    public static void main(String[] args) 
	{
        //initialize scanner class object
        Scanner input = new Scanner(System.in);
		//taking input from user
		System.out.print("Enter unit price:");
		//create variables unitPrice and quantity
        double unitPrice = input.nextDouble();
		//taking input from user
		System.out.print("Enter quantity:");
        int quantity = input.nextInt();
		//create a variable totalPrice
        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // print the output
        System.out.printf("The total purchase price is INR "+totalPrice+  " if the quantity is " +quantity+ " and unit price is INR "+unitPrice);

        // Close the scanner
        input.close();
    }
}
