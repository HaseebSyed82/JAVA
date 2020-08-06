// Setting and printing price for "Chevy"
// Haseeb Syed
// CPSC 24500

package AbstractLab5;

public class Chevy extends Auto {
	
	public Chevy() {
		super("Chevy");
		setPrice();
		print();
	}
	// Setting Price
	public void setPrice() {
		price  = 22000 ;
	}
	  public void print()
	  {
	    System.out.print("The make is: " + make +"\nPrice is: $" + price);
	  }
		
}


