//import scanner class from util package
import java.util.Scanner;
//create BasicCalculator class
public class BasicCalculator 
{
    public static void main(String[] args)
	{
       
        //initialize scanner class object	
		Scanner input= new Scanner(System.in);
		//taking input from user
		System.out.print("Enter number1: ");
		double number1= input.nextDouble();
		//taking input from user
		System.out.print("Enter number2: ");
		double number2= input.nextDouble();
		//create variables add, subtract, multiply, divide
		double add= number1+number2;
		double subtract= number1-number2;
		double multiply= number1*number2;
		double divide= number1/number2;
		
		System.out.print( "The addition, subtraction, multiplication and division value of 2 numbers " +number1+ " and" +number2+ " is "+add+ ", " +subtract+ ", " +multiply+ " and " +divide );
		input.close();
	}
}
