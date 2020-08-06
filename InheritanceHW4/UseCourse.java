// This the main program that gets user data
// and displays fees and course info.
// Supported files: CollegeCourse.java
//					LabCourse.java				
// Author         : Haseeb Syed
// Course         : CPSC 24500

package InheritanceHW4;
import java.util.Scanner;
public class UseCourse {

	public static void main(String[] args) {
		//test
		CollegeCourse test = new CollegeCourse("Eng", 101,3);
		System.out.println(test.display());
		//test1
		LabCourse course = new LabCourse("BIO", 105, 4);
		System.out.println(course.display());

		//scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//string of lab courses
		
		String labCourses = "BIO, CHM, CIS, PHY";
		
		// Get user data
		System.out.print("Enter Course Department: ");
		String Deptartment = input.next();
		
		System.out.print("Enter Course Number: ");
		int CourseNumber = input.nextInt();
		
		System.out.print("Enter Number of  Credits: ");
		int NumOfCredits = input.nextInt();
		
		if(labCourses.indexOf(Deptartment.toUpperCase()) >= 0) {
			LabCourse lab = new LabCourse(Deptartment, CourseNumber, NumOfCredits);
			System.out.println(lab.Display());
		} else {
			CollegeCourse course1 = new CollegeCourse(Deptartment, CourseNumber, NumOfCredits);
					System.out.println(course1.display());

		}
	}

}
