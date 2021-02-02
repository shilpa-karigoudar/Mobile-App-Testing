package OOPConcept2;

public interface USBank {
	// 100% abstraction

	public void credit();
	
	public void debit();
	
	public void transfterMoney();
	
	int min_Bal=100; //static n final  once defined cannot change the value
	
	
	// Properties of Interface
	//1. Only Method declaration
	//2. no method body - only method prototype
	//3. we can declare the variables
	//4. variables are by default static - value of the vars will not be changed
	//5. no static methods in interface
	//6. no main method
	//7. we cannot create object of interface
	//8.interfaces are abstract in nature - we cannot instantiate
	
	
}
