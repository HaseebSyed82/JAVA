// This is a sub class for Auto Super class
// Haseeb Syed
// CPSC 24500

package HW6Interface;

public class Model1 extends Auto implements AntiLockBrakes {
	
	public  Model1() {
		super("Audi");
		
	}
	public void Model() {
		System.out.println("This is "+ name + " a Model 1 Car");
	}
	
	public void AntiLockBrakes() {
		System.out.println("This Model 1 car has Anti-Lock Brakes.");
	}
	
}
