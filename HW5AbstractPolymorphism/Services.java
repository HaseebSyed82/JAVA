// This is a sub class that uses account.java
// Set and returns number of hours, and price per hour
// and return the total amount.
// Haseeb Syed
// CPSC 24500

package HW5AbstractPolymorphism;

public class Services extends Account{
	private int numberOfHours;
	private int ratePerHour; 
	
	public Services(int accountId, int numberOfHours, int ratePerHour) {
		super(accountId);
		 this.numberOfHours = numberOfHours;
		 this.ratePerHour=ratePerHour;
		 computeSales();
		toString();
	}
	
	 public void setNumOfHours(int numberOfHours) {
		 this.numberOfHours = numberOfHours;
	 }
	 
	 public void setRatePerHour(int ratePerHour ) {
		 this.ratePerHour=ratePerHour;
	 }
	 
	 public int getNumofHours() {
		 return numberOfHours;
	 }
	 
	 public int getRatePerHour() {
		 return ratePerHour;
	 }
	 
	 public int computeSales() {
		 return numberOfHours * ratePerHour;
	 }
	 
	 public String toString() {
		 return (super.toString() + "\n" +
				 	"Service Hours: " + numberOfHours + "\n" +
				 	"Service Charge "  + ratePerHour + "\n" +
				 	"Total Amount for Service: " + computeSales()+ "\n");
	 }

}
