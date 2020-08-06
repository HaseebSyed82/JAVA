// This is a sub class that uses account.java
// Set and returns number of items, and price per items
// and return the total amount.
// Haseeb Syed
// CPSC 24500


package HW5AbstractPolymorphism;

public class Supplies extends Account {
	
	private int numberOfItems;
	private int pricePerItem; 
	
	public Supplies(int accountId, int numberOfItems, int pricePerItem) {
		super(accountId);
		computeSales();
		toString();
		this.numberOfItems=numberOfItems;
		this.pricePerItem = pricePerItem;
	}
	
	 public void setNumofItems(int numberOfItems) {
		 this.numberOfItems = numberOfItems;
	 }
	 
	 public void setPricePerItem(int pricePerItem ) {
		 this.pricePerItem=pricePerItem;
	 }
	 
	 public int getNumofItems() {
		 return numberOfItems;
	 }
	 
	 public int getPricePerItem() {
		 return pricePerItem;
	 }
	 
	 public int computeSales() {
		 return numberOfItems * pricePerItem;
	 }
	 
	 public String toString() {
		 return (super.toString() + "\n" +
				 	"Number of Sales:" + numberOfItems + "\n" +
				 	"Price Per Item :" + pricePerItem + "\n" +
				 	"Total Sale:" + computeSales()+ "\n");
	 }
	

}
