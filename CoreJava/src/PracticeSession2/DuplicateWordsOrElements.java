package PracticeSession2;

import java.util.Scanner;

public class DuplicateWordsOrElements {
	
	public static void duplicates(String s){
		
		String[] words = s.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			for(int j=i+1;j<words.length;j++){
			
				if(words[i].equals(words[j])){
			       
					System.out.println(words[i]);	
			
				}
		}
	
		}
	}

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Line");
		
		String nextLine = s.nextLine();
		
		duplicates(nextLine);
	}

}
