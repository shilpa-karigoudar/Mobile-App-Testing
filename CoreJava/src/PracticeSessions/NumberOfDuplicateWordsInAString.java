package PracticeSessions;

import java.util.HashMap;
import java.util.Set;

public class NumberOfDuplicateWordsInAString {

	public static void NumberOfDuplicateWords(String inputString){
		
		String[] words = inputString.split(" ");
		
		// create one hashmap
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		//to check each word in a given array
		
		for(String word:words){
			//if a word is present in the array
			
			if(wordCount.containsKey(word)){
				wordCount.put(word, wordCount.get(word)+1);
			}
			else
				wordCount.put(word, 1);
		}
		
		
		//extracting all the keys of the map
		
		Set<String> wordsInString = wordCount.keySet();
		
		for(String word:wordsInString){
			
			if(wordCount.get(word)>1){
				System.out.println(word +" : " +wordCount.get(word));
			}
			
		}
	}
	public static void main(String[] args) {
		NumberOfDuplicateWords("I love you and you love me and");
		

	}

}
