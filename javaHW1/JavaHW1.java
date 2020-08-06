/*
 This program demonstrates use of menu driven and tells user about author.
 Author : Haseeb Syed
 Course: CPSC24500
 
 */

package javaHW1;

import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class JavaHW1 {

	public static void main(String[] args) {
		int selection = 0;
		
		// loop
		do {
			
			// Menu 
		System.out.println("What would you like to ask me? ");
		System.out.println("1. What is my full name?");
		System.out.println("2. Where did I go to high school? ");
		System.out.println("3. What are my favorite hobbies?");
		System.out.println("4. What is my philosophy on life? ");
		System.out.println("5. What do I hope to do for a career? ");
		System.out.println("6. What do I look like? ");

		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the number of your choice, or 0 to quit: ");
		selection = kb.nextInt();
		
		// Switch case for all menu items
		switch(selection) {

		case 1:
			System.out.println("Haseebuddin Syed");
			System.out.println("");
			break;

		case 2: 
			System.out.println("North High School");
			System.out.println("");
			break;
			
		case 3: 
			System.out.println("Music");
			System.out.println("Playing Batminton");
			System.out.println("Video Games");
			System.out.println("");
		break;
		
		case 4: 
			System.out.println("\"If you set your goals ridiculously high "
					+ "and it's a failure, you will fail "
					+ "above everyone else's success.\" -James Cameron");
			System.out.println("");
			break;
			
		case 5:
			System.out.println("Learn Something New Everyday.");
			System.out.println("");
			break;
			
		case 6: 
			System.out.println("Check me out. (Your browser should open and reveal your picture") ;
			System.out.println("");
			try {
			Desktop d = Desktop.getDesktop();
			URI url = new URI("https://lh3.googleusercontent.com/"
					+ "LAOoNUa5piFbM89ELTVeehvVbtHiYkTyweoZykl4F-yRS8yk-sJQCH9kIk"
					+ "qWuQXWrSrIi0XvjhdMstuwVMBAtezm1IR5VTRSYJPhS-YcmfKC9kchb9fE"
					+ "AHfhC7POzQgFGVCMchMppCJTTXB_E5K49Lx5IZKcgGEbhGT07_HrbyIPB-FS0WbOnbo"
					+ "l6CR9lXUV2VEchfhWeBYILhwTjnZcJPwL8b5sVQnh8gfewFEp41XhzIi5t4uO1wP-cTJ22iOMTf"
					+ "uM-B66A1w6sUfJ0z9EJZrKux_ITxCgyN1HL2ij8HgMT2NaXixbC1AUX4jkBZOMjMyNaEm7wvx3UG0o"
					+ "cFPw79v4c5PwQdKBrmGCVT-DmSPvJ45maXQ-JuQQh2DfsAdMNi3JrgWHLAsvizrcSIp_d6DvDxyNuJ"
					+ "d9ag8chr8bTsBBRJ7OBDLpvDmAPacM9BPH1DEVt6jCNiI0SbpOeEsBbppvtgzSiCzsO2X7YXr7wQqgNcq_5"
					+ "6IGc5fEhfdfsJwUb3OfJc689X8pTHIObsG5ggWrvyVzueByVs-sdNxvYPANhLCU0Hn93YVaHNX4lILVY07"
					+ "Qx1Qm6LReZ9lBAfHsN4Yd1YvM92ClkrapQlBsB6ffLxVavBuThKFBz-zGcyntzy895v6-jOWaEniFRSOju5LE"
					+ "Arc8T-vceAo-l2JvK5QdIeXc0ts-1g=w1000-no-tmp.jpg");
			d.browse(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		case 0:
			System.exit(selection);
			break;
			
			
		}

		}while(selection != 0);

	}

}
