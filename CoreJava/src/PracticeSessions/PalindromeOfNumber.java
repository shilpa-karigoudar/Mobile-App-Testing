package PracticeSessions;

public class PalindromeOfNumber {


	public static void isPalindrome(int num){
		System.out.println("Given number is :" +num);
		int rem=0;
		int sum=0;
		int temp;
		
		temp=num;
		while(num>0){
		rem = num%10;  // get the reminder
		sum=(sum*10)+rem;
		num =num/10;
		}
		
		if(temp==sum){
			System.out.println("is a palindrome number");
		}
		else 
			System.out.println("is not a palindrome");
	}
	
	public static void main(String[] args) {
		
		isPalindrome(135);
		isPalindrome(151);
		isPalindrome(13531);
		isPalindrome(11);
		isPalindrome(1);

	}

}
