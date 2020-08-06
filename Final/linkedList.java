// This program stores 50 random integers into linked list.
// Then sorts the list, calculate sum, and average.
// Haseeb Syed
// CPSC 24500

package Final;
import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class linkedList {

	public static void main(String[] args) {
		
	LinkedList <Integer> lnkLst = new LinkedList<Integer>();		
	
	int n = 50;
	Random r = new Random();
	
	for(int i =0; i < n; i ++) {
		lnkLst.add(r.nextInt(100));
	}
	
	// Printing out 50 random Integers
	System.out.println("Getting 50 Random Integers...");
	System.out.println();
	System.out.print("50 Random Integers:");
	for (int i = 0; i < lnkLst.size(); i++) {
		if (i % 10 == 0) {
			System.out.println();
			
			}
		System.out.print(lnkLst.get(i) +  " ");
		
		}
	System.out.println();
	System.out.println();
	
	// Sorting linked list using Collections.sort
	System.out.print("50 Sorted Integers:");
	Collections.sort(lnkLst);
	for (int i = 0; i < lnkLst.size(); i++) {
		if (i % 10 == 0) {
			System.out.println();
			}
		System.out.print(lnkLst.get(i) +  " ");
		}
	System.out.println();
	System.out.println();
	
	//Calculating sum and avg
	float ttl = 0;
	for (int i : lnkLst)
		ttl += i;
	System.out.println("Sum of Integers:" + ttl);
	System.out.println("Avg of Integers:" + ttl/n);
	}
}
