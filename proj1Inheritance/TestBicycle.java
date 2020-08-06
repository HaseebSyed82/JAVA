package proj1Inheritance;

public class TestBicycle {

	public static void main(String[] args) {
		
		MountainBicycle test = new MountainBicycle (4, 30, 25);
		System.out.println(test.toString());
		System.out.println("");
		
		MountainBicycle test1 = new MountainBicycle();
		System.out.println(test1);
		System.out.println("");
		
		MountainBicycle test2 = new MountainBicycle(3,50,20);
		System.out.println(test2);
		System.out.println("");
		test2.setHeight(22);
		System.out.println("The new Height is " + test2.seatHeight + "\n");
	}

}
