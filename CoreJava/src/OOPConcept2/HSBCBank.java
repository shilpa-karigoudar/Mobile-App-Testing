package OOPConcept2;

public class HSBCBank implements USBank,BrazilBank{
// is - a relationship - class and interface relationship - implements keyword
	
	// has - a relationship = class to class - extends keyword
	
	//Multiple Inheritance using interface
// if a class is implementing an interface its mandatory to define all the methods and class can have their own methods
	// USBank Methods
	public void credit(){
		
		System.out.println("HSBC Credit");
	};
	
	public void debit(){
		
		System.out.println("HSBC Debit");
	};
	
	public void transfterMoney(){
		
		System.out.println("Transfer Money");		
	};
// HSBC Bank Methods
	public void educationLoan(){
		System.out.println("educationLoan");
	}

	public void carLoan(){
		System.out.println("CarLoan");
	}
// overriding from BrazilBank
	public void mutualFund(){
		System.out.println("MutualFund");
	}
}
