// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************
import java.util.Scanner;
public class Distance
{
public static void main (String[] args)
{
double x1, y1, x2, y2; // coordinates of two points
double distance; // distance between the points
Scanner scan = new Scanner(System.in);
// Read in the two points
System.out.print ("Enter the coordinates of the first point " +
"(put a space between them): ");
x1 = scan.nextDouble();
y1 = scan.nextDouble();
System.out.print ("Enter the coordinates of the second point: ");
x2 = scan.nextDouble();
y2 = scan.nextDouble();
// Compute the distance
distance = (Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
// Print out the answer
System.out.println("The first coordinate is: (" +x1+" , " + y1 +")");
System.out.println("The second coordinate is: (" +x2+" , " + y2 +")");
System.out.println("The distance is: " + Math.sqrt(distance));
}
}
