package PracticeSession2;

public class PalindromeOfNumber {
	
	public static void isPalindrome(int n){
		
		int temp=n;
		int sum=0;
		int rem=0;
		while(n>0){
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		if(temp==sum){
			System.out.println("Given Num:"+temp +"is a Palindrome and its Palindrome is:"+sum);
		}
			
		else
			System.out.println("Given num is not a Palindrome");
	}

	public static void main(String[] args) {


		isPalindrome(121);
	}

}
