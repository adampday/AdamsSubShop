import java.awt.*;
import javax.swing.*;
public class DessertPanel extends JPanel {
	
public final double CHOCOLATE_CAKE = 5.50;
public final double CARROT_CAKE = 6.00;
public final double CHEESE_CAKE = 7.00;
public final double KEY_LIME_PIE = 8.50;

private JCheckBox chocolateCake;
private JCheckBox carrotCake;
private JCheckBox cheeseCake;
private JCheckBox keyLimePie;

/**
 * Constructor
 */

public DessertPanel(){
	setLayout(new GridLayout(4, 1));
	
	chocolateCake = new JCheckBox("Chocolate Cake");
	carrotCake = new JCheckBox("Carrot Cake");
	cheeseCake = new JCheckBox("Cheese Cake");
	keyLimePie = new JCheckBox("Key Lime Pie");
	
	setBorder(BorderFactory.createTitledBorder("Desserts"));
	
	add(chocolateCake);
	add(carrotCake);
	add(cheeseCake);
	add(keyLimePie);
}

/**
 * The getDessertCost returns the cost of
 * the selected dessert.
 */

public double getDessertCost(){
	double dessertCost = 0.0;
	
	if (chocolateCake.isSelected())
		dessertCost += CHOCOLATE_CAKE;
	if (carrotCake.isSelected())
		dessertCost += CARROT_CAKE;
	if (cheeseCake.isSelected())
		dessertCost += CHEESE_CAKE;
	if (keyLimePie.isSelected())
		dessertCost += KEY_LIME_PIE;
	
	return dessertCost;
	
}
}
