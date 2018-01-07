import javax.swing.*;

/**
 * 
 * @author aday
 * The GreetingPanel class is a specialized JPanel class.
 * It displays a greeting for the application window.
 * 
 */
public class GreetingPanel extends JPanel {
	/**
	 * Constructor
	 */
	
	public GreetingPanel()
	{
		// Create the label.
		JLabel greeting = new JLabel("Welcome to Adam's Sub Shop!");
		
		// Add the label to this panel.
		add(greeting);
	}

}
