package PracticeSession2;

public class PrimeNumber {

	public static Boolean isPrime(int n){
		
		if(n<=1){
			return false;
		}
		
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
			
		}
		return true;
	}
	
	public static void PrimeNumberForARange(int n){
		
		for(int i=2;i<n;i++){
			
			if(isPrime(i)==true){
				
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {

	//	System.out.println( isPrime(0));
		PrimeNumberForARange(10);

	}

}
