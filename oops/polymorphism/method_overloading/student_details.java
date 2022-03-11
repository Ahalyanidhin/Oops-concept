package polymorphism.method_overloading;

import java.util.Scanner;

public class student_details {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter roll number:");
		int roll=sc.nextInt();
		System.out.println("Enter department:");
		String dept=sc.next();
		System.out.println("Enter year:");
		int year=sc.nextInt();
		System.out.println("MARKS");
		System.out.println("_____");
		System.out.println("Malayalam");
		int m=sc.nextInt();
		System.out.println("English");
		int e=sc.nextInt();
		System.out.println("Hindi");
		int h=sc.nextInt();
		System.out.println("Science");
		int s=sc.nextInt();
		System.out.println("Social");
		int so=sc.nextInt();
		System.out.println("Mathematics");
		int ma=sc.nextInt();
		int total=0;
		float average=0;
		String rank;
		
		details d=new details();
		d.data(name, roll, dept, year);
		d.data(m, e, h, s, so, ma);
		d.data(m, e, h, s, so, ma, total, average);
	}

}
class details{
	public void data(String name,int roll,String dept,int year) {
		
		System.out.println("STUDENT DETAILS");
		System.out.println("_______________");
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll);
		System.out.println("Department"+dept);
		System.out.println("Year"+year);
		
	}
	
	public void data(int m,int e,int h,int s,int so,int ma) {
		System.out.println("MARKS");
		System.out.println("_____");
		System.out.println("Malayalam:"+m);
		System.out.println("English:"+e);
		System.out.println("Hindi:"+h);
		System.out.println("Science"+s);
		System.out.println("Social:"+so);
		System.out.println("Mathematics:"+ma);
		
	}
	
   public void data(int m,int e,int h,int s,int so,int ma,int total,float average) {
		
	    total=m+e+h+s+so+ma;
	    average=total/6;
	    if(total>=500) {
	    	System.out.println("Rank 1");
	    	
	    }else if(total<=500&&total>=400) {
	    	System.out.println("Rank 2");
	    }else if(total<=399&&total>=200) {
	    	System.out.println("Rank 3");
	    }else {
	    	System.out.println("Failed");
	    }
	   
	   
	}
}