package abstraction;

import java.util.Scanner;

public class example {
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
	    String name=sc.next();
	    
	    System.out.println("Enter id:");
	    int id=sc.nextInt();
	    student st=new student();
	    st.totalmark(name,id);
	   // st.rank1();
	    
	}}
	    abstract class rank
	    
	    {
	    	
	    	abstract void totalmark(String name,int id);
	    	public void rank1(){
	    		System.out.println("rank2");
	    		
	    	}
	    }	    
class student extends rank {
	
	void totalmark(String name,int id) {
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("total marks->455");
		//rank1();
		
		super.rank1();
	}
}		
	


