import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panels {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon1 = new ImageIcon("images/books.jpg");
		ImageIcon icon2 = new ImageIcon("images/lightbulb.jpg");
		JLabel img1, img2;
		img1 = new JLabel("Books", icon1, SwingConstants.CENTER);
		img1.setHorizontalTextPosition(SwingConstants.CENTER);
		img1.setVerticalTextPosition(SwingConstants.BOTTOM);

		img2 = new JLabel("Light Bulb", icon2, SwingConstants.CENTER);
		img2.setHorizontalTextPosition(SwingConstants.CENTER);
		img2.setVerticalTextPosition(SwingConstants.BOTTOM);
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("Sal");
		subPanel1.add(label1);
		// Set up second subpanel
		JPanel subPanel2 = new JPanel();
		subPanel2.setBackground(Color.yellow);

		subPanel2.add(img1);
		subPanel2.add(img2);

		// Set up primary panel
		JPanel primary = new JPanel();
		primary.setBackground(Color.gray);
		primary.add(subPanel1);
		primary.add(subPanel2);

		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}
}
