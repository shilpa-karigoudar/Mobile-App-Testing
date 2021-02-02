package OOPConcept;

public class MethodOverloading {

	//cannot create method inside the method
	// duplicate methods with same method name and same number of arguments is not allowed
	// main method can be overloaded
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(22.0);
		obj.sum(11, 30);
		obj.main(1);
		//obj.main(args); infinite loop
		

	}
	
	public void main(int a){
		System.out.println("Main method Overloaded");
	}
	
	public void main(int a,int b){
		System.out.println("Main method Overloaded with 2 args");
	}
	public void sum(){
		System.out.println("0 Arguments");
	}
	
	// we can not create duplicate methods

	public void sum(int a){
		System.out.println(a);
	}
	
	public void sum(double d){
		System.out.println(d);
		
	}
	
	public void sum(int c,int b){
		System.out.println(c+b);
	}
	
}
