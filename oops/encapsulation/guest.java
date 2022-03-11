package encapsulation;

public class guest {
	
	String number;
	String name;
	String address;
	String contact_number;
	String Email;
	String proof,proof_id;
	
	int n=0,na=0,ad=0,co=0,em=0,pt=0,pi=0;
	public String getNumber() {
		return number;
	}
	public boolean setNumber(String number) {
		if(number.matches("^[0-9]*$"))
				{	
			this.number=number;
			return true;
			
		}
		else 
		{
		//System.out.println("Invalid number");
		n++;
		return false;
		}
		
		
	}
	
	
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if(name.matches("^[a-zA-Z]*$")) {
		this.name = name;
		return true;
		}else {
			//System.out.println("Invalid name");
			na++;
			return false;
		}
	}
	
	
	
	public String getAddress() {
		
		return address;
	}
	public boolean setAddress(String address) {
		if(address.matches("^[a-zA-Z0-9]*$")) {
			this.address = address;
			return true;
			}else {
		//		System.out.println("Invalid address");
				ad++;
				return false;
			}
	
	}
	
	
	public String getContact_number() {
		return contact_number;
	}
	public boolean setContact_number(String contact_number) {
		
		if(contact_number.matches("^[0-9]*$")) {
			this.contact_number = contact_number;
			return true;
			}else {
			//	System.out.println("Invalid contact_number");
				co++;
				return false;
			}
		
	}
	public String getEmail() {
		return Email;
	}
	public boolean setEmail(String email) {
		
		if(email.matches("^[a-zA-Z0-9@.]*$")) {
			this.Email = email;
			return true;
			}else {
		//		System.out.println("Invalid email");
	em++;
				return false;
			}
		
	}
	public String getProof() {
		return proof;
	}
	public boolean setProof(String proof) {
		
		if(proof.matches("^[a-zA-Z]*$")) {
			this.proof = proof;
			return true;
			}else {
				//System.out.println("Invalid proof");
	pt++;
				return false;
			}
		
	}
	public String getProof_id() {
		return proof_id;
	}
	public boolean setProof_id(String proof_id) {
		
		if(proof_id.matches("^[a-zA-Z0-9]*$")) {
			this.proof_id = proof_id;
			return true;
			}else {
				//System.out.println("Invalid proof_id");
	pi++;
				return false;
			}
	
	}
	
	public void display() {
		System.out.println("Number:"+number);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact_number:"+contact_number);
		System.out.println("Email:"+Email);
		System.out.println("Proof Type:"+proof);
		System.out.println("Proof_id:"+proof_id);
	}
	
public void check() {
if(n==0&&na==0&&ad==0&&co==0&&em==0&&pt==0&&pi==0) {
	
	System.out.println("Registration successful");
	display();
}
else {
	if(n==1)
	{
		System.out.println("Invalid number");
	}
	if(na==1)
	{
		System.out.println("Invalid name");
	}
	if(ad==1)
	{
		System.out.println("Invalid address");
	}
	if(co==1)
	{
		System.out.println("Invalid contact_number");
	}
	if(em==1)
	{
		System.out.println("Invalid email");
	}
	if(pt==1)
	{
		System.out.println("Invalid proof_type");
	}
	if(pi==1)
	{
		System.out.println("Invalid proof_id");
	}
	System.out.println("Registration not successful.....");
}

}	

}
