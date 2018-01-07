import java.awt.*;
// test
// test2
import javax.swing.*;
/**
 * 
 * @author aday
 * The BeveragePanel class allows the user to select their beverage.
 */
public class BeveragePanel extends JPanel{
	
// The following constants are used to indicate
// the cost of their selected beverage.
	public final double NO_BEVERAGE = 0.0;
	public final double COKE = 1.00;
	public final double DIET_COKE = 1.05;
	public final double SPRITE = 1.10;
	public final double MOUNTAIN_DEW = 1.15;
	public final double ORANGE_SODA = 1.20;
	
	// Radio buttons for the available beverages.
	private JRadioButton noBeverage;
	private JRadioButton coke;
	private JRadioButton dietCoke;
	private JRadioButton sprite;
	private JRadioButton mountainDew;
	private JRadioButton orangeSoda;

	private ButtonGroup bg;
	
	/**
	 * Constructor
	 */
	
	public BeveragePanel(){
		setLayout(new GridLayout(6, 1));
		
		noBeverage = new JRadioButton("None");
		coke = new JRadioButton("Coke");
		dietCoke = new JRadioButton("Diet Coke");
		sprite = new JRadioButton("Sprite");
		mountainDew = new JRadioButton("Mountain Dew");
		orangeSoda = new JRadioButton("Orange Soda");
		
		bg = new ButtonGroup();
		bg.add(noBeverage);
		bg.add(coke);
		bg.add(dietCoke);
		bg.add(sprite);
		bg.add(mountainDew);
		bg.add(orangeSoda);
		
		setBorder(BorderFactory.createTitledBorder("Beverages"));
		
		add(noBeverage);
		add(coke);
		add(dietCoke);
		add(sprite);
		add(mountainDew);
		add(orangeSoda);
		
	}
	/**
	 * The getBeverageCost method returns the cost of
	 * the selected beverage.
	 */
	
	public double getBeverageCost(){
		double beverageCost = 0.0;
		
		if (noBeverage.isSelected())
			beverageCost = NO_BEVERAGE;
		else if (coke.isSelected())
			beverageCost = COKE;
		else if (dietCoke.isSelected())
			beverageCost = DIET_COKE;
		else if (sprite.isSelected())
			beverageCost = SPRITE;
		else if (mountainDew.isSelected())
			beverageCost = MOUNTAIN_DEW;
		else
			beverageCost = ORANGE_SODA;
		
		return beverageCost;
	}
}
