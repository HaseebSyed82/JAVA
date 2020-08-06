// Setting and printing price for "Ford"
// Haseeb Syed
// CPSC 24500
package AbstractLab5;

public class Ford extends Auto{
	
	public Ford() {
		super("Ford");
		setPrice();
		print();
	}
	// Setting price
	public void setPrice() {
		price  = 20000 ;
	}
	// Setting print
	  public void print()
	  {
	    System.out.println("The make is: " + make +"\nPrice is: $" + price);
	  }
}