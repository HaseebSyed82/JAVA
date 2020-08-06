// This file read data from the file data.txt.
// Get the small and large number sort it and 
// create a file dataoutput.txt
// Author: Haseeb Syed
// Course: CPSC24500


package lab2;

//  Extensions
import java.util.Scanner; 
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class DataOutput {

	public static void main(String[] args) {
		
		Scanner input = null; 
		
		// This is were it looks for the file
		try {          
			Scanner kb = new Scanner(new File("C:\\Users\\shase\\Desktop\\data.txt"));     
			ArrayList<Integer> lines = new ArrayList<Integer>();
			while (kb.hasNextLine()) {
			  lines.add(kb.nextInt());
			}
			// Conversion of data file to array
			Integer[] arr = lines.toArray(new Integer[0]);
			
	        int minimum = Collections.min(lines);
	        int maximum = Collections.max(lines);
	        int sum = 0;
	        int n = arr.length;
	        int avg;
	        for (int i = 0 ; i < n ; i++)
	        	sum +=  arr[i];   
	        
	        // Creating Data outputs file
	        try {
	        	File myObj = new File("dataOutput.txt");
	        	if (myObj.createNewFile()) {
	        		
	        		// This is for me to see that my code works
	        		System.out.println("Number of Integers: " + lines.size());
	        		System.out.println("Minimum: " + minimum);
	        		System.out.println("Maximum: " + maximum);
	        		System.out.println("Sum of List: " + sum);
	        		System.out.println("Average is: " + sum /lines.size());
	        		System.out.println("Sorted Values");
	        		
	        		// This is were my code writes output into dataoutput.txt file
	        		FileWriter myWriter = new FileWriter("dataOutput.txt");
	        	    myWriter.write("Number of Integers: " + lines.size()+ "\n");
	        	    myWriter.append("Minimum: " + minimum + "\n");
	        	    myWriter.append("Maximum: " + maximum+ "\n");
	        	    myWriter.append("Sum of List: " + sum+ "\n");
	        	    myWriter.append("Average is: " + sum/lines.size()+ "\n");
	        	    myWriter.append("\n");
	        	    myWriter.append("Sorted Values");
	        	    
	        		Collections.sort(lines);
	        		for (int i = 0; i < lines.size(); i++) {
	        			if (i % 10 == 0) {
	        				System.out.println();
	        				myWriter.append("\n");
	        				}
	        			System.out.print(lines.get(i) +  " ");
	        			myWriter.append(lines.get(i) +  " ");
	        			}
	        		 myWriter.close();
	        		}else {
	        			System.out.println("File already exists.");
	        			}
	        	} catch (IOException e) {
	        		System.out.println("An error occurred.");
	        		e.printStackTrace();
	        		} 
	        		
	        
			} catch (Exception ex) {          
				System.out.println("Unable to open file.");          
				System.exit(0);    
			} 
		
	}
}