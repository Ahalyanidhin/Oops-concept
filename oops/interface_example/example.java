package interface_example;

public class example {
	
	public static void main(String arg[]) {
		cat c=new cat();
		c.sound();
		c.type();
	}

}

interface animal{
	public void sound();
	public void type();
}
class cat implements animal{
	public void sound() {
		System.out.println("meow.....meow.....");
	}
	public void type() {
		System.out.println("Cat is an omnivorous animal");
	}
}