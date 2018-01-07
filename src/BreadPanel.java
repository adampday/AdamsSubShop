import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author aday
 * The BreadPanel class allows the user to select either
 * white, whole wheat, or pumpernickel bread. 
 */
public class BreadPanel extends JPanel{
	
	// The constants are used to indicate
	// the cost of each type of bread.
	public final double WHITE_BREAD = 1.25;
	public final double WHEAT_BREAD = 1.50;
	public final double PUMPERNICKEL_BREAD = 1.75;
	
	// The following variables will reference radio
	// buttons for white, whole wheat, and pumpernickel breads.
	private JRadioButton whiteBread;
	private JRadioButton wheatBread;
	private JRadioButton pumpernickelBread;
	
	// The following variable will reference a
	// ButtonGroup object to group the radio buttons.
	private ButtonGroup bg;
	
	/**
	 * Constructor
	 */

	public BreadPanel()
	{
		// Create a GridLayout manager with
		// three rows and one column.
		setLayout(new GridLayout(3, 1));
		
		// Create the radio buttons.
		whiteBread = new JRadioButton("White", true);
		wheatBread = new JRadioButton("Wheat");
		pumpernickelBread = new JRadioButton("Pumpernickel");
		
		// Group the radio buttons.
		bg = new ButtonGroup();
		bg.add(whiteBread);
		bg.add(wheatBread);
		bg.add(pumpernickelBread);
		
		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Bread"));
		
		// Add the radio buttons to this panel.
		add(whiteBread);
		add(wheatBread);
		add(pumpernickelBread);
		
	}
	/**
	 * The getBreadCost method returns the cost of
	 * the selected bread.
	 */
	
	public double getBreadCost(){
		// The following variable will hold the cost
		// of the selected bread.
		double breadCost = 0.0;
		
		// Determine which bread is selected.
		if (whiteBread.isSelected())
			breadCost = WHITE_BREAD;
		else if (wheatBread.isSelected())
			breadCost = WHEAT_BREAD;
		else
			breadCost = PUMPERNICKEL_BREAD;
		
		// Return the cost of the selected bread.
		return breadCost;
	}
}
