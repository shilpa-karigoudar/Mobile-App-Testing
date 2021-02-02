package PracticeSessions;

public class FactorialOfNumber {
//without recursive
	
	public static int factorialofNum(int num){
		
		int fact=1;
		for(int i=num;i>0;i--){
			
			fact=fact*i;
		
		}
		return fact;
	}
	
	//with recursive function- a function is calling itself
	public static int fact(int num){
		if(num==0){
			return 1;
		}
		
		else
			num=num*fact(num-1);
		return num;
	}
	
	
	public static void main(String[] args) {

		int factorialofNum = factorialofNum(0);

		System.out.println(factorialofNum);
		
		System.out.println(fact(3));
	}

}
