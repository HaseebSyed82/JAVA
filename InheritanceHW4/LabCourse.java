// This calculates lab fee for course that have 
// lab in it.
// Sub class program for CollegeCourse.java
// Author  : Haseeb Syed
// Course  : CPSC 24500


package InheritanceHW4;

public class LabCourse extends CollegeCourse {
	
	
	
	public LabCourse() {
		
	}
	
	public LabCourse(String dept, int courseNum, int credits) {
		super(dept,courseNum,credits);
		this.fee= fee + 50;
	}
	// Override Dsiplays
	public String Display() {
		return ("This is a Lab Course Fee = $50 " +"\n" +
				super.display());
	}
}
