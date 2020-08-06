// This program uses Java GUI to total
// quarters, dimes, nickels...
// It asks user to enter number of coins and
// then program tells US coin values of each category,
// and tells the total to user.
// Haseeb Syed
// CPSC 24500




package hw9;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


@SuppressWarnings("serial")
public class GUICoins extends JFrame {
	// variables
    private JPanel contentPane;
    private JTextField txtPenny,txtNickles,txtDimes,txtQuarters, txthalfDollar
    , output,  output1, output2, output3, output4,output5;
    double Penny = 1; double Quarters = 25; double Dimes = 10;double Nickles = 5, halfDollar = 50;
    
    public GUICoins() {
    	
    	// title and direction
    	setTitle("Change Counter"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 430, 480);
        contentPane = new JPanel(); 
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null); 
        JLabel lblCurrencyCalculator = new JLabel("Change Counter");
        lblCurrencyCalculator.setBounds(25, 15, 264, 30);
        contentPane.add(lblCurrencyCalculator);
        JLabel lblInsc = new JLabel("Enter the number of "
        		+ "each coin type and hit, Compute");
        lblInsc.setBounds(25, 35, 300, 30);
        contentPane.add(lblInsc);
        
        // Quarters positions
        JLabel lblQuarters = new JLabel("Quarters: ");
        lblQuarters.setBounds(25, 60, 75, 30);
        contentPane.add(lblQuarters);
        txtQuarters = new JTextField();
        txtQuarters.setBounds(90, 60, 75, 25);
        contentPane.add(txtQuarters);
        txtQuarters.setColumns(10);
        JLabel lblQuartersVal = new JLabel("Quarter value: $");
        lblQuartersVal.setBounds(200, 60, 100, 30);
        contentPane.add(lblQuartersVal);
        output1 = new JTextField();
        output1.setBounds(325, 60, 70, 25);
        contentPane.add(output1);
        output1.setColumns(10);
        
        // Dime variable positions
        JLabel lblDimes = new JLabel("Dimes: ");
        lblDimes.setBounds(25, 80, 75, 30);
        contentPane.add(lblDimes);
        txtDimes = new JTextField();
        txtDimes.setBounds(90, 80, 75, 25);
        contentPane.add(txtDimes);
        txtDimes.setColumns(10);
        JLabel lblDimesVal = new JLabel("Dimes value: $");
        lblDimesVal.setBounds(200, 80, 100, 30);
        contentPane.add(lblDimesVal);
        output2 = new JTextField();
        output2.setBounds(325, 80, 70, 25);
        contentPane.add(output2);
        output2.setColumns(10);
        
        //Nickels variable positions
        JLabel lblNickles = new JLabel("Nickels: ");
        lblNickles.setBounds(25, 100, 75, 30);
        contentPane.add(lblNickles);
        txtNickles = new JTextField();
        txtNickles.setBounds(90, 100, 75, 25);
        contentPane.add(txtNickles);
        txtNickles.setColumns(10);
        JLabel lblNicklesVal = new JLabel("Nickels value: $");
        lblNicklesVal.setBounds(200, 100, 100, 30);
        contentPane.add(lblNicklesVal);
        output3 = new JTextField();
        output3.setBounds(325, 100, 70, 25);
        contentPane.add(output3);
        output3.setColumns(10);
        
        //Penny variable positions
        JLabel lblPennies = new JLabel("Pennies: ");
        lblPennies.setBounds(25, 120, 75, 30);
        contentPane.add(lblPennies);
        txtPenny = new JTextField();
        txtPenny.setBounds(90, 120, 75, 25);
        contentPane.add(txtPenny);
        JLabel lblPenniesVal = new JLabel("Penny value: $");
        lblPenniesVal.setBounds(200, 120, 100, 30);
        contentPane.add(lblPenniesVal);
        output4 = new JTextField();
        output4.setBounds(325, 120, 70, 25);
        contentPane.add(output4);
        output4.setColumns(10);
        
        // half Dollar variable positions
        JLabel lblHalfDollar = new JLabel("Half-Dollar: ");
        lblHalfDollar.setBounds(25, 140, 75, 30);
        contentPane.add(lblHalfDollar);
        txthalfDollar = new JTextField();
        txthalfDollar.setBounds(90, 140, 75, 25);
        contentPane.add(txthalfDollar);
        JLabel lblHalfDollarVal = new JLabel("Half-Dollar value: $");
        lblHalfDollarVal.setBounds(200, 140, 150, 30);
        contentPane.add(lblHalfDollarVal);
        output5 = new JTextField();
        output5.setBounds(325, 140, 70, 25);
        contentPane.add(output5);
        output5.setColumns(10);
        
        // Button variable positions
        JButton btnCompute = new JButton("Compute");
        btnCompute.setBounds(25, 200, 150, 30);
		SwingAction action = new SwingAction();
		btnCompute.setAction(action);
        contentPane.add(btnCompute);
        JLabel lblTotal = new JLabel("Total Change value: $");
        lblTotal.setBounds(200, 200, 150, 30);
        contentPane.add(lblTotal);
        output = new JTextField();
        output.setBounds(325, 200, 70, 30);
        contentPane.add(output);
        output.setColumns(10);
    }
    
    // Button Action
	private class SwingAction extends AbstractAction{
    	public SwingAction() {
    		putValue(NAME, "Compute");
    	}
		@Override
		public void actionPerformed(ActionEvent arg0) {
    		try {
    			if (Integer.parseInt(txtPenny.getText()) < 0
    					|| Integer.parseInt(txtQuarters.getText()) < 0
    					|| Integer.parseInt(txtDimes.getText()) < 0
    					|| Integer.parseInt(txtNickles.getText()) < 0
    					|| Integer.parseInt(txthalfDollar.getText()) < 0) {
    				JOptionPane.showMessageDialog(null, "You can not enter negative value"); 
    			}
    			else {
    				// Coveritn to parse 
    				double ttlpenny = (int) (Penny * Double.parseDouble(txtPenny.getText()));
    				double ttlQuarter = (int) (Quarters * Double.parseDouble(txtQuarters.getText()));
    				double ttlDime = (int) (Dimes * Double.parseDouble(txtDimes.getText()));
    				double ttlNickles = (int) (Nickles * Double.parseDouble(txtNickles.getText()));
    				double ttlHalfDollar = (int) (halfDollar * Double.parseDouble(txthalfDollar.getText()));
    				
    				double total = ttlpenny + ttlQuarter + ttlDime + ttlNickles + ttlHalfDollar;
    				double finalDollars = total/100;
    				
    				String Display,DisplayQuarter, DiplayDimes, DisplayNickles, DisplayPennies, DisplayHalfDollar;
    				
    				Display = "" +finalDollars+"";
    				output.setText(Display);
    				// Output
    				DisplayQuarter = "" +ttlQuarter/100+"";
    				output1.setText(DisplayQuarter);
    				DiplayDimes = "" +ttlDime/100+"";
    				output2.setText(DiplayDimes);
    				DisplayNickles = "" +ttlNickles/100+"";
    				output3.setText(DisplayNickles);
    				DisplayPennies= "" +ttlpenny/100+"";
    				output4.setText(DisplayPennies);
    				DisplayHalfDollar= "" +ttlHalfDollar/100+"";
    				output5.setText(DisplayHalfDollar);
    			}
    				
    			} catch (NumberFormatException e1) {
    				  JOptionPane.showMessageDialog(null, "Numbers must be entered."); 
    				
    			}
		}
    }
	// main program

	public static void main(String[] args) {
		GUICoins frame = new GUICoins();
		frame.setVisible(true);

	}

}
