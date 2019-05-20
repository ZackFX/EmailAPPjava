package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String email;
    private String alternateEmail;
    private String companySuffix="haymac.com";

    //Constructor to reveice firstname and lastname
    public Email(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email Created:  " +  this.firstname+ " " + this.lastname);
        
        //call the method asking for department - return the department
        this.department=setDepartment();
        
        
        //call a method that return a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
        //Combine Elements to generate Email
        email=firstname.toLowerCase()+ "."+ lastname.toLowerCase()+ "@" + department + "." + companySuffix;
         //if department is empty we should remove the dot 

    }

    //Ask for department
    private String setDepartment(){
        
    	System.out.print("Department code:  \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:  ");
        
        Scanner in = new Scanner(System.in);
        int depChoice= in.nextInt();
        
        if ( depChoice==1 ) { return "Sales"; }
        else if ( depChoice==2 ) { return "Developement"; }
        else if ( depChoice==3 ) { return "Accounting"; }
        else {return "";}
    }
    
    // Generate random password
    private String randomPassword(int length) {
    	String passwordSet="ABCDEFJHIJKLMOPQRSTUVWXYZ1234567890&@#%£$*€";
    	char[] password = new char[length];
    	for ( int i=0; i<length; i++) {
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i]=passwordSet.charAt(rand);
    	}
    	return new String(password);
    }
    
    //Set The mailbox capacity
    public void setCapacity(int capacity) {
    	this.mailboxCapacity=capacity;
    }
    
    //set alternate email
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail=altEmail;
    	
    
    }
    
    //change password
    public void changePassword(String password) {
    	this.password=password;
    	
    	
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return this.alternateEmail; }
    public String getPassword() { return password; }
    
    public String showInfo() {
    	return "Display Name:  " + firstname +"  "+ lastname +
    			"\nCompany email: " + email +
    			"\nMailbox capacity: " + mailboxCapacity + "mb";
    			
    	
    }
}










