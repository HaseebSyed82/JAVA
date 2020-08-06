// This is Class file used for Employee.java.
// File gets and sets Employee name, hourly rate, hours worked, 
// and calculates gross pay.
// Author  : Haseeb Syed
// Course  : CPSC 24500

package lab3;

import java.text.DecimalFormat;

public class Payroll {
	// data types
	private String fullname;
	private double hourlyRate;
	private double hoursWorked;
	
	// Constructors
	public Payroll()
	{
		fullname = "";
		hourlyRate = 0.0;
		hoursWorked = 0.0;
	}
    Payroll (String fullname, double hourlyRate, double hoursWorked ) {
		this.fullname = fullname;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
    // Getting Data
	public String getFullName () {
		return fullname;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	// Setting Data
	public void setFullName(String fullname) {
		this.fullname = fullname;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	//Calculating gross Pay
	 public String computePay(){
		 DecimalFormat df = new DecimalFormat("0.00");
		 return df.format(hourlyRate * hoursWorked) ;
	 }
	 
	 public void result() {	 
		System.out.println("Employee Name: " + fullname );
		System.out.println("Hourly rate  : " + hourlyRate);
		System.out.println("Hours Worked : " + hoursWorked);
		System.out.println("Gross Pay    : " + computePay()) ;
	 }

}
