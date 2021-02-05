package OOPConcept;

public class FunctionsInJava {

	public static void main(String[] args) {//Starting point of execution
		//main method is void - because we never write return statements inside the main method
		
		FunctionsInJava obj = new FunctionsInJava();
		
		int a = obj.pqr();
		System.out.println("Value of C is :" +a);
		
		int val = obj.division(10, 5);

		System.out.println("Division Value :" +val);
	}
	
	//non static methods
	//void - does not return anything
	
		public void test(){ // no input , no output
			System.out.println("Test Method");	
			}
			
			public int pqr(){ // no input but some output
				System.out.println("PQR Method");
				int a =10;
				int b=20;
				int c= a+b;
			return c;
			}
			
			public String qa(){// no input but some output
				
				String fname="Shilpa";
				return fname;
			}
			
			public int division(int x, int y){
				int z=x/y;
				return z;
			}
			
			
			
			
}
