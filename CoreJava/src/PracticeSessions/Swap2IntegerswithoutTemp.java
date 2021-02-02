package PracticeSessions;

public class Swap2IntegerswithoutTemp {

	public static void main(String[] args) {


		int a=10;
		int b=30;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//by using multiplication
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		//Using XOR
		a=a ^ b; //40
		
		b=a^b;
		
		a=a^b;
		
		
		
		
		System.out.println("a :"+a);
		
		System.out.println("b :"+b);

	}

}
