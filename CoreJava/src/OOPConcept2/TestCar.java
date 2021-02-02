package OOPConcept2;

public class TestCar {

	public static void main(String[] args) {


		BMW b= new BMW();
		
		b.start();   // Method is common in child class as well as in parent class, so the preference 
		//will be given to child class method is called method overriding
		
		// is also called static polymorphism - compile time polymorphism
		
		b.stop();// Inherited method from parent to child
		
		b.theftSafety();
		
		b.engine();
		System.out.println("*****************************");
		
		
		Car c = new Car();
		
		c.start();
		c.stop();
		
		//c.theftSafety();
	
		//Top Casting 
		Car c1 = new BMW(); // child class object can be referred by parent class object is called dynamic polymorphism or runtime polymorphism
		
		c1.start();
		
		c1.stop();
		
		//down Casting
		
		// BMW b1 = new Car(); - not allowed, allowed only if casting is done in compile time
		
		BMW b1 = (BMW) new Car(); // ClassCastExpection - runtime exception
		
		//Polymorphism is object taking many forms 
		
		
		
		
	}

}
