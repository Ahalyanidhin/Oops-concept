package inheritance;

import java.util.Scanner;

public class heirarchical {

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		B m=new B();
		C n=new C();
		m.display();
		m.sum(a, b);
		n.difference(a, b);
		
	}
	
}
