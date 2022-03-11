package polymorphism.method_overriding;

public class curbill extends bill{
	
	public void total(int bn1,String cn1,int uc,double cu) {
		
		System.out.println("Bill number:"+bn1);
		System.out.println("Customer name:"+cn1);
		double ta=uc*cu;
		System.out.println("Total amount:"+ta);
	}

}
