package interface_example;

import java.util.Scanner;

public class sample {
public static void main(String args[]) {
	System.out.println("AREA AND PERIMETER");
	System.out.println("Enter the length:");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	
	circle c=new circle();
	c.area(s);
	c.perimeter(s);
	
	cube cu=new cube();
	cu.area(s);
	cu.perimeter(s);
}
}

	class circle implements shape{

	@Override
	public void area(int s) {
		// TODO Auto-generated method stub
		double x=Math.PI*s*s;
		System.out.println("\nCIRCLE");
		System.out.println("**********");
		System.out.println("AREA OF CIRCLE:"+x);
	}

	@Override
	public void perimeter(int s) {
		// TODO Auto-generated method stub
		double y=2*Math.PI*s;
		System.out.println("PERIMETER OF CIRCLE:"+y);
		
	}
		
	}
		
	class cube implements shape
	{

		@Override
		public void area(int s) {
			// TODO Auto-generated method stub
			System.out.println("\nCUBE");
			System.out.println("********");
			double m=6*s*s;
			System.out.println("AREA OF CUBE:"+m);
		}

		@Override
		public void perimeter(int s) {
			// TODO Auto-generated method stub
			double n=12*s;
			System.out.println("PERIMETER OF CUBE:"+n);
		}
		
	}

	

