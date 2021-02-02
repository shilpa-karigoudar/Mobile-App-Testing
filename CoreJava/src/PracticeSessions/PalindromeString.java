package PracticeSessions;

public class PalindromeString {
	
	public static void isPalindromeString(String test){
		
		
		
		String rev="";
		
		int length = test.length();
		for(int i=length-1;i>=0;i--){
			rev=rev+test.charAt(i);
		}
		
		if(test.equals(rev)){
			System.out.println("is a Palindrome");
		}
		
		else
			System.out.println("is not a Palindrome");
		
	}

	public static void main(String[] args) {


		isPalindromeString("gadag");

	}

}
