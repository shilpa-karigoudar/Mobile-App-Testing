package PracticeSession2;

public class PalindromeString {

	public static void isPalindromeString(String s){
		
		String rev="";
		
		for(int i=0;i<s.length();i++){
			
			rev = rev+ s.charAt(i);
		}
		
		if(s.equals(rev)){
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");
	}
	public static void main(String[] args) {

		isPalindromeString("Gadag");

	}

}
