package EmailApp;

import java.util.Scanner;

public class Email {
	
	//properties and variables
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private String CompanySuffix = "alley.com";
	int mailboxcapacity = 500;
	int passLength = 10;
	
	//constructor to receive the firstname and lastname
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println( "EMAIL CREATED : " + this.firstname + " " + this.lastname);
		
		//call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Your Department :       " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(passLength);
		System.out.println("Your password will be : " + this.password);
		
		//combine elements to generate email
		this.email = this.firstname.toLowerCase() + this.lastname.toLowerCase() + this.department + "." + CompanySuffix;
		System.out.println("Your Email is :         " + this.email);
	}
	
	
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("enter the department\n*************\n1 for sales\n2 for Development\n3 for Accounting\n0 for none \n");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 1) {
			return "Sales";
		}
		else if(choice == 2) {
			return "Dev";
		}
		else if(choice ==3) {
			return "Acc";
		}
		else {
			return "";
		}	
	}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0 ; i < length ; i++ ) {
			int rand = (int) ( Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	//set the alternate email
	public void setAltEmail(String AltEmail) {
		this.alternateEmail = AltEmail;
	}
	
	//change the password
	public void changePassword(String newpass) {
		this.password = newpass;
	}
	
	//return mail box capacity
	public int getMailBoxCapacity() {
		return mailboxcapacity;
	}
	
	//return alternate email
	public String getAltEmail() {
		return alternateEmail;
	}
	
	//return password
	public String getPassword() {
		return password;
	}
	
	public String showinfo() {
		return "Display name : " + firstname.toLowerCase() + " " + lastname.toLowerCase() + "\n" + "Company EMail : " + email + "\n" + "MailBox Capacity : " + " " + mailboxcapacity + "mb";
	}

}
