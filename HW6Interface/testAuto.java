// This is a test program for Auto Class
// Haseeb Syed
// CPSC 24500


package HW6Interface;

public class testAuto {

	public static void main(String[] args) {
		Model1 m1 = new Model1();
		m1.Model();
		m1.AntiLockBrakes();
		System.out.println();
		
		Model2 m2 = new Model2();
		m2.Model();
		m2.CruiseControl();
		System.out.println();
		
		Model3 m3 = new Model3();
		m1.Model();
		m3.PowerSteering();
	}

}
