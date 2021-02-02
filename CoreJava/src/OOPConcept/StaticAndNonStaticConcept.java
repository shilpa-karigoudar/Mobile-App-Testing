package OOPConcept;

public class StaticAndNonStaticConcept {

	String name="Tom";  // non static global
	static int age=25;  // static global
	
	public static void main(String[] args) {
    
		// how to call static methods and vars
		// direct calling as they are freely available in java memory
		sum();
		//calling by className
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		
		System.out.println(StaticAndNonStaticConcept.age);
		
		// how to call non static methods and vars
		// by creating objects

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		
		obj.sum();   // static method also can be accessed using object reference
		
		obj.sendMail();

	}

	public void sendMail(){ //non static method
		
		System.out.println("Send mail Method");
	}
	
	public static void sum(){
		System.out.println("Sum method");
	}
	
	
}
