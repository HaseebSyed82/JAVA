// This program uses serialization to store and 
// display input and output
// Haseeb Syed
// CPSC 24500

package HW11Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")

// Serialized Class
class Person implements Serializable{
	String name, phoneNum, bday, email;

	public Person(String name, String phoneNum, String bday, String email) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.bday = bday;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Name  : " + name + "\n" +
				"Phone : " + phoneNum + "\n" +  
			    "B-Day : " + bday + "\n" +
			    "Email : " + email + "";
	}
}


// Main calss
public class serialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Three person objects
		Person n1 = new Person("Mike McAlex", "123-456-7890", "01/02/1991","abcd@hotmail.com" );
		Person n2 = new Person("Jimmy", "987-456-1230","10/12/1980", "dcba@yahoo.com");	
		Person n3 = new Person("Timmy", "456-123-9870","05/24/1989", "qwery@gmail.com");

		
		int selection = 0;
		// Menu
		do {
			System.out.println("1) Add information into a file");
			System.out.println("2) Retrieve information from a file and display them");
			System.out.println("0) Exit");
			
			Scanner kb = new Scanner(System.in);
			System.out.print("Your Choice : ");
			selection = kb.nextInt();
			
			
			switch(selection) {
			case 1:
				// Writing to file
				try {
					writeToFile(n1,n2, n3);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Writing person information in Person.bin file...\n");
				break;
				
				// reading from file
			case 2:
				System.out.println("Below is read-able Person.bin file information...\n");
				try {
					readFile();
				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 0:
				System.exit(selection);
				break;
			default:
				System.out.println("Invalid Selection...");
					
			}
		}while (selection != 0);
	}
	
	// Writing to file
	@SuppressWarnings("resource")
	public static void writeToFile(Person p, Person p1, Person p2)
					throws IOException{ObjectOutputStream oos 
		= new ObjectOutputStream(new FileOutputStream("Person.bin"));
		
		oos.writeObject(p);
		oos.writeObject(p1);
		oos.writeObject(p2);
	}
	
	// Readin to file
	@SuppressWarnings("resource")
	public static void readFile() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.bin"));
		
		Person p = (Person) ois.readObject();
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p);
		System.out.println();
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
	}

}
