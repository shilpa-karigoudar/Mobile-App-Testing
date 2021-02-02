package PracticeSession2;

public class FactorialOfANum {
	
	public static int recursive_fact(int n){
		int fact=1;
		if(n==0){
			return 1;
		}
		else {
			
			fact=fact*factorialNum(n-1);
		return n;
		}
	}
	
	public static int factorialNum(int num){
		int fact=1;
		for(int i=num;i<=1;i--){
			
			fact=fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {

		System.out.println(factorialNum(6));
		System.out.println(recursive_fact(7));
	}

}
