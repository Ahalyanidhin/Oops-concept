package task.oopsconcept;

import java.util.Scanner;



public class Train_tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Passengers details");
		System.out.println("__________________");
		System.out.println("Enter price of ticket:");
		int price=sc.nextInt();
		System.out.println("Enter number of persons:");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
		System.out.println("Details of person"+i);
		System.out.println("__________________");
		
		System.out.println("Name:");
		String name=sc.next();
		System.out.println("Gender(m/f)");
		String g=sc.next();
		System.out.println("Age");
		int a=sc.nextInt();
		
		
		
		}
		total to=new total();

		to.totalamount(price, n);
	}

}
abstract class passengers

{
	
	abstract void totalamount(int price,int n);
	public void display(){
		System.out.println("Ticket details are.....");

	}
}	    
class total extends passengers {

  void totalamount(int price,int n) {
int t=price*n;
  super.display();
  
  System.out.println("No.of Passengers:"+n);
  System.out.println("Price of ticket:"+price);
  System.out.println("Total amount="+t);
  
  
}
}