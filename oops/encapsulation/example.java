package encapsulation;

import java.util.Scanner;

public class example {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		student s=new student();
		System.out.println("Enter your name");
		s.setName(sc.next());
		System.out.println("Enter your id");
		s.setId(sc.nextInt());
		System.out.println("Your name is:"+s.getName());
		System.out.println("Your id is"+s.getId());
	}

}
