package task.oopsconcept;

import java.util.Scanner;

public class operations {

	public void display() {
		System.out.println("Operations");
		System.out.println("**********");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=sc.nextInt();
		System.out.println("Enter number b:");
		int b=sc.nextInt();
		
		
		sum s=new sum();
		dif d=new dif();
		mul m=new mul();
		div di=new div();
		
		d.display();
		s.sumvalue(a,b);
		d.difvalue(a,b);
		m.mulvalue(a,b);
        di.divvalue(a, b);
		m.dis();
		di.dis();

	}

}
