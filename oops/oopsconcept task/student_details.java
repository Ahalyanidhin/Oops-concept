package task.oopsconcept;

import java.util.Scanner;

public class student_details {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your department");
		String dept=sc.next();
		System.out.println("Enter your roll number");
		String roll=sc.next();
		System.out.println("Enter your address");
		String add=sc.next();
		System.out.println("Enter your mobile number");
		int mob=sc.nextInt();
		
		
		
		System.out.println("\n ***STUDENT DETAILS***");
		System.out.println("***__________________***");
		
		System.out.println("NAME:"+name);
		System.out.println("ID:"+id);
		System.out.println("DEPARTMENT:"+dept);
		System.out.println("ROLL NUMBER:"+roll);
		System.out.println("ADDRESS:"+add);
		System.out.println("MOBILE NUMBER:"+mob);
		
		
		
	}

}
