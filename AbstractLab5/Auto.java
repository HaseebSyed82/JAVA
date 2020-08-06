//This is an abstraction for vehicles
// Haseeb Syed
// CPSC 24500
package AbstractLab5;

public abstract class Auto {
	protected String make;
	protected double price;
	public abstract void setPrice();
	public abstract void print();
	//get and set statements
	public Auto(String make){
		this.make= make;
	}
	public String getMake(){
	    return make;
	  }
	public double getPrice(){
	    return price;
	}
}
