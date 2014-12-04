// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount of employees");
		 int SALESPEOPLE = scan.nextInt();
			int[] sales = new int[SALESPEOPLE];
			int sum;
		// fill in the condition of the for loop
		for (int i=0; i< SALESPEOPLE; i++) 
		{
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		}
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		int max=sales[0];
		int min=sales[0];
		int minIndex = 0;
		int maxIndex = 0;
		// fill in the condition of the for loop
		for (int i=0; i < sales.length; i++)
		{	if(sales[i] > max){ max = sales[i];
				maxIndex = (i+1);}
			if(sales[i] < min){ min = sales[i];
				minIndex = (i+1);}
		
			System.out.println(" " + (i+1) + " " + sales[i]);
			sum += sales[i];
		}
		System.out.println("\nTotal sales: " + sum);
		System.out.println("\nAverage sale: " + (sum / SALESPEOPLE));
		System.out.println("Salesperson "+ maxIndex+ " had the highest sale with "+max+".");
		System.out.println("Salesperson "+ minIndex+ " had the lowest sale with "+min+".");
		
		System.out.println("Enter a Number to see if it is higher than the employee id.");
		int num = scan.nextInt();
		int numAbove = 0;
		for(int i =0; i< sales.length; i++){
			if(i > num){System.out.println("Employee id" +(i+1)+" has a larger number than yours.");
			numAbove++;}
			
		}
		System.out.println("There are a total of  "+numAbove+" employess with a higher number.");
	}
	
}
