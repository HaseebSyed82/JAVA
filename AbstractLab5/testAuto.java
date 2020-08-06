//This is the main the program for the 
// testauto.java this files uses 
//abstraction form auto.java and two other files.
// Haseeb Syed
// CPSC 24500

package AbstractLab5;

import java.util.ArrayList;
import java.util.Arrays;

public class testAuto {
	// array list for auto class
	public static void main(String[] args) {
		ArrayList<Auto> cars = new ArrayList<Auto>(
				Arrays.asList(new Ford(),new Chevy()));
		
		// For statement for printing
		for (int i = 0; i < 0 ; i++) {
			cars.get(i).print();
			
		}
	}

}
