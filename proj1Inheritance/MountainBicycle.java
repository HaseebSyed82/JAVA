package proj1Inheritance;

public class MountainBicycle extends Bicycle{
	
	public int seatHeight;
	public MountainBicycle() {
		
	}

	public MountainBicycle(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String toString() {
		return(super.toString() + "\n" +
				"Seat height is       " + seatHeight)	;
	}
	
}
