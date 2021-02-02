package JavaPrograms;

public class ConstructorConcept {


	public ConstructorConcept(){     // not a function 
									// constructor overloading
		// Constructor is called immediately after the object of the class is created
	
		System.out.println("default Constructor");
	}
	
	public ConstructorConcept(int i){
	
		System.out.println("1 Param Constructor" +i);
	}

	public ConstructorConcept(int i, int j){
	
		System.out.println("1 Param Constructor" +i +j);
	}
	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();

		ConstructorConcept obj1 = new ConstructorConcept(10);
		
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
	}

}
