
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Darvin
 */
public class Dice {

    public static void main(String[] args) {
        int dice1, dice2;
        Random rand = new Random();
        dice1 = rand.nextInt(6) + 1; // we are referencing the Random object to output between 0 - 5 and then add 1 to get 1-6
        dice2 = rand.nextInt(6) + 1;

        System.out.println("The value of dice 1 is: " + dice1);
        System.out.println("The value of dice 2 is: " + dice2);
        System.out.println("The sum of the dice is: " + (dice1 + dice2));

    }

}
