// This is Account Class that will be used by other 
// sub classes. Return ID, and set Ids.
// Haseeb Syed
// CPSC 24500


package HW5AbstractPolymorphism;

public  abstract class Account {
	
	private int accountId;
	abstract int computeSales();
	
	public Account () {
		
	}
	
	public Account (int accountId) {
		this.accountId= accountId;
	}
	
	public void  setId(int accountId) {
		this.accountId=accountId;
		
	}
	public int  getId() {
		return accountId;
	}
	
	public String toString() {
		return ("Account ID: " + accountId);
	}

}
