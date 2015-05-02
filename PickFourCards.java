import java.awt.*;
import javax.swing.*;

public class PickFourCards extends JFrame {
	public PickFourCards() {
		
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
