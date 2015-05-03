import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PickFourCards extends JFrame {
	//Create an array to store the 52 cards
	private ImageIcon[] cards = new ImageIcon[52];
	
	//Create a label to put icons
	JLabel[] jlbl = new JLabel[4];
	
	public PickFourCards() {
		//Create an image icon from an card file
		for(int k = 0; k < 52; k++){
			cards[k] = new ImageIcon("card/"+(k+1)+".png");
		}
		
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
		
		//Create panel p1 to display the four cards
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 4));
		
		//display the icon
		for(int i = 0; i < 4; i++){
			jlbl[i] = new JLabel(cards[i]);
			p1.add(jlbl[i]);
		}
		
		//Create panel p2 to put the refresh button
		JPanel p2 = new JPanel();
		JButton refresh = new JButton("Refresh");
		p2.add(refresh,new FlowLayout(FlowLayout.CENTER));
		
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
