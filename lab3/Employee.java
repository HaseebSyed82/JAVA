// This program calculates employee payroll. 
// File displays Employee name, hourly rate, hours worked, and gross pay.
// Author        : Haseeb Syed
// Course        : CPSC 24500
// Supported File: Payroll.java

package lab3;

public class Employee {

	public static void main(String[] args) {
		
		System.out.println("Payroll");
		System.out.println("");
		// Data 
		 Payroll[] employee = new Payroll[5];
	     employee[0] = new Payroll ("Jane Doe", 35.95, 40); 
         employee[1] = new Payroll ("John Doe", 45.84, 39);  
		 employee[2] = new Payroll ("Jack Doe", 36.95, 45); 
		 employee[3] = new Payroll ("Jack Doe", 42.95, 31); 
		 employee[4] = new Payroll ("Jimy Doe", 30.95, 24); 
		 
		 for (int i =0; i < 5 ; i++) {
			 employee[i].result();
			 System.out.println("");
		 }

	}

}
 