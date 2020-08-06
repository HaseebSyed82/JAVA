// This is class for Two points to store data
// Author        : Haseeb Syed
// Course        : CPSC 24500



package javaHW3;
public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		x = 0.0;
		y = 0.0;	
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
   public double distance(MyPoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + 
   			 Math.pow(myPoint.getY() - y, 2));
   }

 	public MyPoint distance(double x, double y) {
 		return (new MyPoint(getX(), getY()));
 	}

}
