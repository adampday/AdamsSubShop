import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

/**
 * 
 * @author aday
 * The OrderCalculatorGUI class creates the GUI for the
 * Adam's Sub Shop application.
 */
// test
public class OrderCalculatorGUI extends JFrame{
	// The following constant is for the sales tax rate.
	private final double TAX_RATE = 0.07;
	
	// The following variables will reference the
	// custom panel objects.
	private BreadPanel breads;			// Bread panel
	private ToppingPanel toppings;		// Topping panel
	private BeveragePanel beverages;	// Beverage panel
	private DessertPanel desserts;		// Dessert panel
	private GreetingPanel banner;		// To display a greeting
	
	// The following variables will reference objects
	// needed to add the Calculate and Exit buttons.
	private JPanel buttonPanel;			// To hold the buttons
	private JButton calcButton;			// To calculate the cost
	private JButton exitButton;			// To exit the application
	
	/**
	 * Constructor
	 */
	
	public OrderCalculatorGUI(){
		
		// Display a title.
		super("Order Calculator");
		
		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a BorderLayot manager for
		// the content pane.
		setLayout(new BorderLayout());
		
		// Create the custom panels.
		banner = new GreetingPanel();
		breads = new BreadPanel();
		toppings = new ToppingPanel();
		beverages = new BeveragePanel();
		desserts = new DessertPanel();
		
		// Call the buildButtonPanel method to
		// create the button panel.
		buildButtonPanel();
		
		// Add the components to the content pane.
		add(banner, BorderLayout.NORTH);
		add(breads, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(beverages, BorderLayout.CENTER);
		add(desserts, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
		
		/**
		 * The buildButtonPanel method builds the button panel.
		 */
		
		private void buildButtonPanel(){
			buttonPanel = new JPanel();
			
			calcButton = new JButton("Calculate");
			exitButton = new JButton("Exit");
			
			calcButton.addActionListener(new CalcButtonListener());
			exitButton.addActionListener(new ExitButtonListener());
			
			buttonPanel.add(calcButton);
			buttonPanel.add(exitButton);
		}
		/**
		 * Private inner class that handles the event when
		 * the user clicks the calculate button.
		 */
		
		private class CalcButtonListener implements ActionListener
			{
			public void actionPerformed(ActionEvent e){
				double subtotal;
				double tax;
				double total;
				
				subtotal = breads.getBreadCost() +
						   toppings.getToppingCost() +
						   beverages.getBeverageCost() +
						   desserts.getDessertCost();
				
				tax = subtotal * TAX_RATE;
				total = subtotal + tax;
				DecimalFormat dollar = new DecimalFormat("0.00");
				JOptionPane.showMessageDialog(null, "Subtotal: $" +
							dollar.format(subtotal) + "\n" +
							"Tax: $" + dollar.format(tax) + "\n" +
							"Total: $" + dollar.format(total));
			}
		}
			/**
			 * Private inner class that handles the event when
			 * the user clicks the Exit button.
			 */
			
			private class ExitButtonListener implements ActionListener
			{
				public void actionPerformed(ActionEvent e){
					System.exit(0);
				}
			}
	}


