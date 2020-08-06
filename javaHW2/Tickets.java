


package javaHW2;

import java.util.Scanner; 
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;


public class Tickets {
	public static void main(String[] args) {
		//Scanner input = null;
		try {
			Scanner kb = new Scanner(new File("C:\\Users\\shase\\Desktop\\tickets.txt"));
			ArrayList<Double> price = new ArrayList<>();
			while (kb.hasNextLine()) {
				price.add(kb.nextDouble());	
			}
			Double[] arr = price.toArray(new Double[0]);
			
			
			double max = Collections.max(price);
			double min = Collections.min (price);
			int sum = 0;
			int n = arr.length;
	        for (int i = 0 ; i < n ; i++)
	        	sum +=  arr[i]; 

    		System.out.println("Maximum " + max);
    		System.out.println("Minimum " + min);
    		System.out.println("Avergae is " + sum/price.size());
    		
    		 DecimalFormat df = new DecimalFormat("0.00");
    		
    		try {
				FileWriter myWriter = new FileWriter("Output.txt");
				 myWriter.write("*******************************************\n ");
				 myWriter.append("               TICKET REPORT\n");
				 
				 myWriter.append("******************************************* \n\n");
				 
				 
				 myWriter.append("There are " + n +  " tickets in the database.   \n\n");
				 myWriter.append("Maximum Ticket price is  $" + max + ".\n");
				 myWriter.append("Minimum Ticket price is $" + min + ".\n");
				 myWriter.append("Average Ticket Price is $" + df.format(sum/price.size()) + ".\n\n");
				 
				 myWriter.append("Thank you for using our ticket system!\n");
				 myWriter.append("*******************************************\n ");
				
				myWriter.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
			

		} catch(FileNotFoundException  e) {          
			System.out.println("Unable to open file.");
			System.exit(0);
		
	}
		
	}
}
