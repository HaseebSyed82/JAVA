// This is a test program for Account.java, 
// Supplies.java, and Services.Java 
// Haseeb Syed
// CPSC 24500

package HW5AbstractPolymorphism;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class companySales {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to Services and Supplies !");
		
		String numOfItems = JOptionPane.showInputDialog( "How many Accounts: " ); 
		
		String fstSupacctId, fstSupNumofItems, fstSupPrcOfItem ;
		String secSupacctId, secSupNumofItems, secSupPrcOfItem ;

		 fstSupacctId =  JOptionPane.showInputDialog( "Enter first Account Id for Supplies:" ); 
		 fstSupNumofItems =JOptionPane.showInputDialog( "Enter number of items for Supplies:" );
		 fstSupPrcOfItem = JOptionPane.showInputDialog( "Enter price per item Supplies:" );
		 String fstSupacctId1 = JOptionPane.showInputDialog( "Enter Second Account Id for Supplies:" ); 
		 String fstSupNumofItems2 =JOptionPane.showInputDialog( "Enter number of items for Supplies:" );
		 String fstSupPrcOfItem3 = JOptionPane.showInputDialog( "Enter price per item Supplies:" );
		 
		 secSupacctId =  JOptionPane.showInputDialog( "Enter first first Id for Services:" ); 
		 secSupNumofItems =JOptionPane.showInputDialog( "Enter number of items for Supplies:" );
		 secSupPrcOfItem = JOptionPane.showInputDialog( "Enter price per item Supplies:" );
		 String secSupacctId1 =  JOptionPane.showInputDialog( "Enter first Second Id for Services:" ); 
		 String secSupNumofItems2 =JOptionPane.showInputDialog( "Enter number of items for Supplies:" );
		 String secSupPrcOfItem3 = JOptionPane.showInputDialog( "Enter price per item Supplies:" );
		 
		 int n1, n2, n3,n4, n5, n6;
		 
		 n1 = Integer.parseInt(fstSupacctId); n2 = Integer.parseInt(fstSupNumofItems);
		 n3 = Integer.parseInt(fstSupPrcOfItem); n4 = Integer.parseInt(secSupacctId);
		 n5 = Integer.parseInt(secSupNumofItems);n6 = Integer.parseInt(secSupPrcOfItem);
		 
		 int s1 = Integer.parseInt(fstSupacctId1);int s2 = Integer.parseInt(fstSupNumofItems2);
		 int s3 = Integer.parseInt(fstSupPrcOfItem3); int s4 = Integer.parseInt(secSupacctId1);
		 int s5 = Integer.parseInt(secSupNumofItems2);int s6 = Integer.parseInt(secSupPrcOfItem3);
		
		// Array list for Supplies
		ArrayList<Account> sup = new ArrayList<Account>(
				Arrays.asList(new Supplies(n1, n2,n3), 
						new Supplies(s1,s2,s3),
						new Services(n4,n5,n6),
						new Services(s4,s5,s6)));
		
		
			for (int i =0; i <sup.size(); i++) {
				JOptionPane.showMessageDialog(null, sup.get(i).toString(), "Information", 
						JOptionPane.INFORMATION_MESSAGE); 
			}
		
	}

}
