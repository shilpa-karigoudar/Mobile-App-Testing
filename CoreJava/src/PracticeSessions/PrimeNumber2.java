package PracticeSessions;

public class PrimeNumber2 {

	public static Boolean isPrimeNum(int num){
		if(num<=1){
			return false;
		}
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		
		return true;
		
		
		
		
	}
	
	public static void ListOfPrimeNums(int n){
		for(int i=2;i<n;i++){
		if(isPrimeNum(i)){
			System.out.println(i+" ");
		}
	}
	}
	public static void main(String[] args) {

		System.out.println("2 ia a prime number? :" +isPrimeNum(2));

		ListOfPrimeNums(20);
	}

}
