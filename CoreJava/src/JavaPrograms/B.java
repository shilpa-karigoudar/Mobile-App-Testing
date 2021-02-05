package JavaPrograms;

public class B extends A{

	public B(){
		super();   // super keyword is used to call parent class constructor
		// default constructor will be called even though we dont use super()
		//only 1 super() can be used in 1 constructor
		
		System.out.println("Child Class Constructor");
	}
	
	public B(int i){
		super(i);   
		
		System.out.println("Child Class Constructor"+i);
	}
	
	public static void main(String args[]){
		
		B b = new B();
		B b1 = new B(10);
	}
}
