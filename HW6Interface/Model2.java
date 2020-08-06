// This is a sub class for Auto Super class
// Haseeb Syed
// CPSC 24500

package HW6Interface;

public class Model2 extends Auto implements CruiseControl {
	
	public  Model2() {
		super("BMW");
		
	}
	
	public void Model() {
		System.out.println("This is "+ name +" a Model 2 Car");
	}
	
	public void CruiseControl() {
		System.out.println("This Model 2 car is equipped wiht Cruise Control.");
	}

}
