package proj1Inheritance;

public class Bicycle {
	
	private int gear;
	private int speed;
	public Bicycle() {
		
		
	}
	
	public Bicycle(int gear, int speed){
		this.gear= gear;
		this.speed= speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return ("Number of gears are  " + gear + " \n"
				+ "Speed  of Bicycle is " + speed);
	}
}