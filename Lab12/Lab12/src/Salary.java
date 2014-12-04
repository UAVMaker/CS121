
// ************************************************************
// Salary.java
//
// Computes the amount of a raise and the new salary for an employee. The current salary
// and a performance rating ("Excellent", "Good" or "Poor") are input.
// ************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary; // employee's current salary
		double raise = 0; // amount of the raise
		double newSalary; // new salary for the employee
		
		int rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating (3 is Excellent, 2 is Good, or 1 is Poor): ");
		rating = scan.nextInt(); 
		
		// Compute the raise using three if statements to deal with three rating levels
		if(rating == 3) raise = .06 * currentSalary;
	 if(rating ==2) raise = .04 * currentSalary;
		if(rating ==1) raise = .015 * currentSalary;
		
		
		
		newSalary = currentSalary + raise;
		
		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println( "Your new salary: " + money. format (newSalary) );
		System.out.println();
	}
}
