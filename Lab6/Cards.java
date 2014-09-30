/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darvin
 */
public class Cards {
    enum Rank{ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
    
    public static void main(String[] args){
    Rank faceCard, card1, card2;
    faceCard = Rank.queen;
    card1 = Rank.four;
    card2 = Rank.two;
    System.out.println("A one card hand: " + faceCard);
    System.out.println("A two card hand: " +card1+" "+ card2);
    System.out.println("Hand Value: " + ((card1.ordinal() + 1) + (card2.ordinal() + 1)));
    
    }
    
}
