package PracticeSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void findDuplicateElements(String s[]){
		
		for(int i=0;i<=s.length-1;i++){
			for(int j=i+1;j<=s.length-1;j++){
				if(s[i].equals(s[j])){
					System.out.println("Duplicate Elements : " +s[i]);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		

		String names[] = {"Java","JavaScript","Python","Java","C","C"};
		

		// compare each element
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
				System.out.println("Duplicate Elemets : "+names[i]);
				}
			}
			
			
			//2. Using HashSet - Hasset is part of java Collections- Stores unique values
			
			Set<String> Store = new HashSet<String>();  //set is the interface and HashSet is class implementing it
			
			// Set Object cannot store duplicate values
			
			for(String name:names){
				if(Store.add(name)==false){
					System.out.println(name);
				}
			}
			
			
			//3. HashMap   // key Value Pair
			
			Map<String,Integer> storeMap = new HashMap<String,Integer>();
			
			for(String name:names){
				
				Integer count = storeMap.get(name);
				if(count==null){
					storeMap.put(name, 1);  //1 is count
				}
				else
					storeMap.put(name, ++count);
			}
			//get the values from the hashmap
			Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
			
			for(Entry<String, Integer> entry : entrySet){
				if(entry.getValue()>1){
					System.out.println("Duplicate Element is :" +entry.getKey());
				}
			}
			
		}
		
	}
	



}
