package inheritance;

import java.util.Scanner;

public class multilevel {
	
	public static void main(String args[]) {
		student s= new student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		
		s.details(name);
		s.teach();
		s.subject();
		s.student();
	}

}
