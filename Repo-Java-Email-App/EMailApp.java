package EmailApp;

import java.util.Scanner;

public class EMailApp {

	public static void main(String[] args) {
		// variables & data
		String fname, lname;

		// read the data from user
		Scanner inp = new Scanner(System.in);
		System.out.print("ENter first name : ");
		fname = inp.nextLine();
		System.out.print("\nENter last name : ");
		lname = inp.nextLine();

		// creating object for the Email class and passing data
		Email em = new Email(fname, lname);

		// method for setting alternate email
		em.setAltEmail("batman@gmail.com");
		System.out.println("Your alternate email :  " + em.getAltEmail());

		// show everything here
		System.out.println(em.showinfo());

	}

}
