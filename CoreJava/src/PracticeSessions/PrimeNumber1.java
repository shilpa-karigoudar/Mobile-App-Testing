package PracticeSessions;

public class PrimeNumber1 {

	public static Boolean isPrimeNumber(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
			
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num){
		
		for(int i=2;i<=num;i++){
			if(isPrimeNumber(i)){
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumber1 obj = new PrimeNumber1();
		//obj.getPrimeNumbers(20);

		System.out.println("2 is a prime number " +isPrimeNumber(2));
		System.out.println("9 is a prime number " +isPrimeNumber(9));
		getPrimeNumbers(7);
		
	}

	
}
