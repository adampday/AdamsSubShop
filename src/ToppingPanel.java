import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author aday
 * The ToppingPanel class allows the user to select
 * the toppings for their sandwich.
 */

@SuppressWarnings("serial")
public class ToppingPanel extends JPanel{
	// The following constants are used to indicate
	// the toppings for their sandwich.
	public final double TURKEY = 4.50;
	public final double HAM = 4.50;
	public final double TUNA = 5.00;
	public final double ITALIAN = 5.50;
	public final double CHEESE = 0.25;
	public final double PICKELS = 0.25;
	public final double LETTUCE = 0.25;
	public final double TOMATO = 0.25;
	public final double ONION = 0.25;

	
	// Check boxes for the available toppings.
	private JCheckBox turkey;	// Turkey
	private JCheckBox ham;		// Ham
	private JCheckBox tuna;		// Tuna
	private JCheckBox italian;	// Italian
	private JCheckBox cheese;	// Cheese
	private JCheckBox pickels;	// Pickels
	private JCheckBox lettuce;	// Lettuce
	private JCheckBox tomato;	// Tomato
	private JCheckBox onion;	// Onion
	
	
	
	/**
	 * Constructor
	 */
	public ToppingPanel()
	{
		// Create a GridLayout manager with
		// nine rows and one column.
		setLayout(new GridLayout(9, 1));
		
		// Create the check boxes.
		turkey = new JCheckBox("Turkey");
		ham = new JCheckBox("Ham");
		tuna = new JCheckBox("Tuna");
		italian = new JCheckBox("Italian");
		cheese = new JCheckBox("Cheese");
		pickels = new JCheckBox("Pickels");
		lettuce = new JCheckBox("Lettuce");
		tomato = new JCheckBox("Tomato");
		onion = new JCheckBox("Onion");
		
		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		// Add the check boxes to this panel.
		add(turkey);
		add(ham);
		add(tuna);
		add(italian);
		add(cheese);
		add(pickels);
		add(lettuce);
		add(tomato);
		add(onion);
		
	}
	
	/**
	 * The getToppingCost method returns the cost of
	 * the selected toppings.
	 */
	
	public double getToppingCost(){
		// The following variable will hold the cost
		// of the selected topping.
		double toppingCost = 0.0;
		
		// Determine which topping is selected. More
		// than one may be selected.
		if (turkey.isSelected())
			toppingCost += TURKEY;
		if (ham.isSelected())
			toppingCost += HAM;
		if (tuna.isSelected())
			toppingCost += TUNA;
		if (italian.isSelected())
			toppingCost += ITALIAN;
		if (cheese.isSelected())
			toppingCost += CHEESE;
		if (pickels.isSelected())
			toppingCost += PICKELS;
		if (lettuce.isSelected())
			toppingCost += LETTUCE;
		if (tomato.isSelected())
			toppingCost += TOMATO;
		if (onion.isSelected())
			toppingCost += ONION;
		
		// Return the topping cost.
		return toppingCost;
		
	}
}
