package PracticeSessions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {


//		System.out.println("Enter the Number");
//		Scanner s = new Scanner(System.in);
//		s.next();
		
		int n=5;
		int rem=0;
		
		//prime number - check the divisor upto n/2
		
		for(int i=2;i<=n/2;i++){
			rem=n%i;
			if(rem==0){
				break;
			}
			
			
		}
		
		if(rem==0){
			System.out.println(n +" is not a prime number");
		}
		else {
			System.out.println(n + " is a prime number");
		}
		

	}

}
