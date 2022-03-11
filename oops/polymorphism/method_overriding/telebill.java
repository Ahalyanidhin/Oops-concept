package polymorphism.method_overriding;

public class telebill extends bill {
	
	public void total(int bn,String cn,int tc,double cp) {
		
		System.out.println("Bill number:"+bn);
		System.out.println("Customer name:"+cn);
		double ta=tc*cp;
		System.out.println("Total amount:"+ta);
		
	}
	
	

}
