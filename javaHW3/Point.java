//This programs calculates Distance between two points.
//Then displays results
// Author        : Haseeb Syed
// Course        : CPSC 24500
// Supported File: MyPoint.java

package javaHW3;
import java.text.DecimalFormat;
public class Point {

	public static void main(String[] args) {
		
		DecimalFormat df= new DecimalFormat("0.00");
		// Points
        MyPoint p1 = new MyPoint(); 
        MyPoint p2 = new MyPoint(10,30.5);
        // Displays distance of two points
		System.out.println("The Distance between (" + p1.getX() + "," + p1.getY() +") "
				+ "and (" + p2.getX()+"," + p2.getY()+ ") is " +  
				df.format(p1.distance(p2))); 
		// Display point 3
		MyPoint p3 = new MyPoint(5.0,7.2);
		System.out.println("Point 3 is (" +(p3.getX()+"," + p3.getY()+ ")"));

	}

}
