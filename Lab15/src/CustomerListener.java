import java.util.ArrayList;
import java.util.Scanner;


public class CustomerListener {
	public static void main(String[] args){
		ArrayList<String> customerName = new ArrayList();
		customerName.add("Cathy");
		customerName.add("Ben");
		customerName.add("Jorge");
		customerName.add("Wanda");
		customerName.add("Freddie");
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> customerBalance = new ArrayList();
		
		
		for(int i = 0; i < customerName.size(); i++){
			System.out.println(customerName.get(i));
			System.out.println("Enter Account Balance:");
			double bal = scan.nextDouble();
			customerBalance.add(bal);
			
		}
		
		for(int i =0; i< customerName.size(); i++){
			
			System.out.println(customerName.get(i) +" has a balance of "+ customerBalance.get(i));
		}
		
		System.out.println("Enter the person index you want to remove (Ex. Cathy = 1)");
		int num = scan.nextInt() -1;
		customerName.remove(num);
		customerBalance.remove(num);
		for(int i =0; i< customerName.size(); i++){
			
			System.out.println(customerName.get(i) +" has a balance of "+ customerBalance.get(i));
		}
		
		
		
	}

}
