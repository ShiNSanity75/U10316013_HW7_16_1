import java.awt.*;
import javax.swing.*;

public class PickFourCards extends JFrame {
	public PickFourCards() {
		//Create panel p1 to display the four cards
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 4));
		
		//Create panel p2 to put the refresh button
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 1));
		p2.add(new JButton("Refresh"));
		
		//Add contents to the frame
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		
	}
	
	/**Main Method*/
	public static void main (String[] args) {
		PickFourCards frame = new PickFourCards(); //Create a frame
		frame.setTitle("Pick Four Cards"); //set the title of frame
		frame.setSize(400, 300); //Set the size of frame
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display the frame
	}
}
