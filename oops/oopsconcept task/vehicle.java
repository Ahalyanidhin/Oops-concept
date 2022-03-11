package task.oopsconcept;

public class vehicle {

	public void start() {
		System.out.println("Welcome to vehicle family");
		
	}
	public static void main(String[] args) {
		car c=new car();
		bus b=new bus();
		c.start();
		b.display();
		c.display();
		
		

	}

}
