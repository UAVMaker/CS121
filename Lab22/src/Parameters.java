//*******************************************************
import java.util.Random;
// Parameters.java
//
// Illustrates the concept of a variable parameter list.
//*******************************************************
import java.util.Scanner;
public class Parameters
{
	//-----------------------------------------------
	// Calls the average and minimum methods with
	// different numbers of parameters.
	//-----------------------------------------------
	public static void main(String[] args)
	{	Scanner scan = new Scanner(System.in);
		double mean1, mean2, mean3, mean4, mean5, mean6;
		mean1 = average(42, 69, 37);
		mean2 = average(35, 43, 93, 23, 40, 21, 75);
		mean3= average(13);
		mean4 = average();
//		System.out.println ("mean1 = " + mean1);
//		System.out.println ("mean2 = " + mean2);
//		System.out.println ("mean3 = " + mean3);
//		System.out.println ("mean4 = " + mean4);
//		
//		int[] numbers = new int[10];
//		System.out.println("Enter a positive number, enter a negative to exit loop");
//		for(int i=0; i < numbers.length; i++){
//			
//			int num = scan.nextInt();
//			
//			if(num < 0){
//				System.out.println("Exit Loop"); break;
//			}	numbers[i]= num;
//			System.out.println("Enter another positive number");
//			}
//		mean5 = average(numbers);
//		mean6 = minimum(numbers);
//		System.out.println ("mean5 = " + mean5);
//		System.out.println ("min = " + mean6);
		Random rand = new Random();
		
		int[][] movies = new int[4][10];
	      // Load the table with values
	      for (int row=0; row < movies.length; row++)
	         for (int col=0; col < movies[row].length; col++){
	        	  
	            movies[row][col] = rand.nextInt(3)+1;
	        	 movies[1][4] = 3;
	        	 movies[3][3] = 1;}
	            

	      // Print the table
	      for (int row=0; row < movies.length; row++)
	      {
	         for (int col=0; col < movies[row].length; col++)

	            System.out.print (movies[row][col] + "\t");
	         System.out.println();
	      }
	}
		
	
	//----------------------------------------------
	// Returns the average of its parameters.
	//----------------------------------------------
	public static double average (int ... list)
	{
		double result = 0.0;
		if (list.length != 0)
		{
			int sum = 0;
			for (int num: list)
				sum += num;
			result = (double)sum / list.length;
		}
		return result;
	}
	
	public static double minimum(int ... list){
		double min = Double.MAX_VALUE;
		for(int i=0; i < list.length; i++){
			if(list[i]< min){min = list[i];}
		}
		
		return min;
	}
}