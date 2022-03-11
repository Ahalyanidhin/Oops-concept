package interface_example;

import java.util.Scanner;

public class multiple_inheritance {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		System.out.println("Enter the total mark:");
		int total=sc.nextInt();
student s=new student();
s.display(id, name);
s.total(total);
	}

}
interface total{
	public void total(int total);
	
}

interface rank{
	public void display(int id,String name);
	
}

class student implements total,rank
{

	
	public void display(int id,String name) {
	System.out.println("NAME:"+name);
	System.out.println("ID:"+id);	
	}

	
	public void total(int total) {
		System.out.println("TOTAL:"+total);
	}
	
	
	
	
	
	
	
}