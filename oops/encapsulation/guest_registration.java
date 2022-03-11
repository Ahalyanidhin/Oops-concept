package encapsulation;

import java.util.Scanner;

public class guest_registration {

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	guest g=new guest();
	
	System.out.println("Enter the number:");
	g.setNumber(sc.next());
	System.out.println("Enter your name:");
	g.setName(sc.next());
	System.out.println("Enter your address:");
	g.setAddress(sc.next());
	System.out.println("Enter contact number:");
	g.setContact_number(sc.next());
	System.out.println("Enter email_id:");
	g.setEmail(sc.next());
	System.out.println("Enter proof_type:");
	g.setProof(sc.next());
	System.out.println("Enter proof_id:");
	g.setProof_id(sc.next());
	
	g.check();
}	
}
