import java.text.DecimalFormat;
import java.util.Scanner;


public class Triangle {
	public static void main(String[] args){
		double a, b,c, semiP;
		DecimalFormat decimal = new DecimalFormat("0.###");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of side a: ");
		a = Double.parseDouble(scan.next());
		System.out.println("Enter the length of side b: ");
		b = Double.parseDouble(scan.next());
		System.out.println("Enter the length of side c: ");
		c = Double.parseDouble(scan.next());
		
		semiP = (a+b+c)/2;
		
		double area = Math.sqrt(semiP * ((semiP -a)*(semiP - b)*(semiP - c)));
		System.out.println("The area of the triangle using Heron's formula is "+decimal.format(area)+".");
		
	}

}
