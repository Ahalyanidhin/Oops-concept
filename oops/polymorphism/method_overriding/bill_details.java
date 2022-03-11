package polymorphism.method_overriding;

import java.util.Scanner;

public class bill_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("TELEPHONE BILL DETAILS");
System.out.println("......................");
System.out.println(" Enter bill number:");
int bn=sc.nextInt();
System.out.println("Customer name:");
String cn=sc.next();
System.out.println("Total number of calls:");
int tc=sc.nextInt();
System.out.println("Cost per call:");
double cp=sc.nextDouble();


System.out.println("CURRENT BILL DETAILS");
System.out.println("....................");
System.out.println(" Enter bill number:");
int bn1 =sc.nextInt();
System.out.println("Customer name:");
String cn1=sc.next();
System.out.println(" Total unit consumed:");
int uc=sc.nextInt();
System.out.println("Cost oer unit:");
double cu=sc.nextDouble();


System.out.println("TELEPHONE BILL");
System.out.println("______________");
telebill tb=new telebill();
tb.display();
tb.total(bn,cn,tc,cp);


System.out.println("CURRENT BILL");
System.out.println("____________");
curbill cb=new curbill();
cb.total(bn1, cn1, uc, cu);

	}

}
