
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darvin
 */
public class Wrapper {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int input = Integer.parseInt(scan.next());
    System.out.println("The minimum value for an integer is: " + Integer.MIN_VALUE);
    System.out.println("The maximum value for an integer is: " + Integer.MAX_VALUE);
    
    System.out.println("Enter two decimal integers: ");
    int input2 = Integer.parseInt(scan.next());
    int input3 = Integer.parseInt(scan.next());
    
    System.out.println("The sum of the two integers entered is: " + (input2 + input3));
    }
    
}
