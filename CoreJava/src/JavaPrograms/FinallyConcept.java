package JavaPrograms;

public class FinallyConcept {

	public static void main(String[] args) {
     
		div();


	}

	public void Test1(){
	  
		try{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
		System.out.println("inside Finally Block");
		}
	}
	
	public static void test2(){
		try{
			System.out.println("inside Test2");
		}
		finally{
			
			System.out.println("finally in Test2");
		}
	}
	
	public static void div(){
		int i=10;
		try{
			System.out.println("inside try block");
			int k=i/0;
		}catch(ArithmeticException e){
			System.out.println("inside catch");
		}
		finally{
			System.out.println("it will execute even after any exception");
		}
}
}