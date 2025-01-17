import java.util.Scanner;
//create BonusEmployee class
public class BonusEmployee 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        final int numberOfEmployees = 10;
		//create arrays 
        double[] salaries = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonuses = new double[numberOfEmployees];
        double[] newSalaries = new double[numberOfEmployees];
		//create variable to store values and assigh=n the value 0.0
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        //create a foor loop and input salaries and years of service
        for (int i = 0; i < numberOfEmployees; i++) 
		{
            while (true) 
			{
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service of employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                //create if else statement to check if the salary and year is less than 0 or not
                if (salary < 0 || years < 0) 
				{
                    System.out.println("Invalid input. Salary and years of service must be positive.");
                } 
				else 
				{
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break; 
                }
            }
        }
        //Calculate bonuses and new salaries
        for (int i = 0; i < numberOfEmployees; i++) 
		{
            if (yearsOfService[i] > 5) 
			{
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
			//calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];
			//calculate bonus
            totalBonus += bonuses[i]; 
			//calculate total old salary
            totalOldSalary += salaries[i]; 			
			//calculate total new salary
            totalNewSalary += newSalaries[i]; 
        }

        //print total bonus payout and total salaries
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
        // Close the scanner
        scanner.close();
    }
}