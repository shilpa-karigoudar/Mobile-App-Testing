package OOPConcept;

public class LocalVsGlobalVariables {

	int age=25; //Global Variables
	String name="Tom";  //Global Variables
	public static void main(String[] args) {
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		int i=10;
		System.out.println(i);
		
		System.out.println(obj.name); //In order to access global variables we have to create object of the class
		
		obj.age=30;
		
		System.out.println(obj.age);
	}
	
	public void sum(){
		int i=20;
		int j=30;
		int age=30;   // scope of this age is available only within sum method- local variable
		
	}

	
}
