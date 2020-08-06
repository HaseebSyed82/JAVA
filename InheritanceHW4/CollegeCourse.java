// This program gets course department,
// number, credits and caculated fees for course.
// Author  : Haseeb Syed
// Course  : CPSC 24500


package InheritanceHW4;

public class CollegeCourse {
	private String dept;
	private int courseNum;
	private int credits;
	protected int fee;
	
	public CollegeCourse() {
		
	}
	public CollegeCourse(String dept, int courseNum, int credits) {
		this.dept = dept;
		this.courseNum = courseNum;
		this.credits = credits;
		this.fee = credits* 120;
	}
	// Displays
	protected String display() {
		return ("Course    : " + dept + " " + courseNum + "\n" +
				"Credits   : "+ credits + "\n" +
				"Fee       : "+ fee + "\n");
	}

}
