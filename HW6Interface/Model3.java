// This is a sub class for Auto Super class
// Haseeb Syed
// CPSC 24500

package HW6Interface;

public class Model3 extends Auto implements PowerSteering{
	
	public  Model3() {
		super("Benz");
		
	}
	public void Model() {
		System.out.println("This is a " +name+" Model 3 Car");
	}
	public void PowerSteering () {
		System.out.println("This Model 3 car is equipped wiht Power Steering.");
	}

}
