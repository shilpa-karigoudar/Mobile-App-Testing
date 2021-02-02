package AbstractConcept;

public abstract class Bank {

	//partial abstraction - abstraction is - hiding the implementation logic is called abstraction
	
	// using abstract keyword
	// 1 method should be there with atleast one method
	
	// abstract class can have abstract methods and non abstract methods
	 
	
	// interface is 100% abstraction- 
	
	public abstract void loan();  // no method body  - abstraction is used mainly to hide some description about
	
	public void credit(){
		System.out.println("Credit");
	}
	
	public void debit(){
		System.out.println("Debit");
	}
	
	
}
