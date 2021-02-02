package PracticeSessions;

import java.util.Scanner;

public class StrngPalindrome {

	public static void main(String[] args) {


		System.out.println("Please Enter the String :");
		Scanner sc= new Scanner(System.in);
		
		
		String str=sc.nextLine();
		
		String rev="";
		
		int length = str.length();
		
		for(int i=length-1;i>0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
		

	}

}
