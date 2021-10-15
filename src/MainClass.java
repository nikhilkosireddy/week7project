import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	  {
		String name;
		String email;
		String phoneno;
		String address;
		String type; 
		
	 
	     Scanner in = new Scanner(System.in);
	 
	     //Get input String
	     System.out.println("Enter your name: ");
	     name = in.nextLine();
	     System.out.println("Enter your email: ");
	     email = in.nextLine();
	     System.out.println("Enter your phoneno: ");
	     phoneno = in.nextLine();
	     System.out.println("Enter your address: ");
	     address = in.nextLine();
	     System.out.println("Enter user type as user or sp: ");
	     type = in.nextLine();
	     
	     UserAccount u = new UserAccount();
	     UserStore us = new UserStore(u);
	     
	     Person person = us.create(name, email, phoneno, address, type);
	     System.out.println(person);
	     
	  }
}