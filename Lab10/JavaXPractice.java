
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darvin
 */
public class JavaXPractice {
    public static void main(String[] args){
     JFrame frame = new JFrame ("Window"); // create JFRAME
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // Click the exit
      frame.setBackground(Color.GRAY);
      ImageIcon icon = new ImageIcon ("images/books.jpg");
      ImageIcon icon2 = new ImageIcon("images/lightbulb.jpg");
      JLabel label1, label2, label3;

      label1 = new JLabel ("Naresh Hing");
	//Third parameter defines the position of the entire label
      label2 = new JLabel ("BOOKS", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.CENTER);
      label2.setVerticalTextPosition (SwingConstants.BOTTOM);

      label3 = new JLabel ("Light Bulb", icon2, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);


      JPanel panel = new JPanel();
      panel.setBackground (Color.GREEN);
      panel.setPreferredSize (new Dimension (200, 250));
      panel.add (label1);

      
      JPanel panel2 = new JPanel();
      panel2.setBackground(Color.YELLOW);
     
      panel2.add (label2);
      panel2.add (label3);
      
      JPanel primary = new JPanel();
      primary.add(panel);
      primary.add(panel2);
      frame.getContentPane().add(primary);
     
      frame.pack();
      frame.setVisible(true);
    }
    
}
