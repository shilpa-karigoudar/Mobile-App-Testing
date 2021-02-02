package JavaPrograms;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {


		Hashtable h = new Hashtable();
		h.put(1, "Test");
		h.put(2, "Hello");
		h.put(3, "World");
		
		System.out.println(h.size());
		System.out.println(h.get(1));
		h.put(1, "one");
		System.out.println(h.get(1));
		
		h.put("4", "Tom");
		
		// key and value can be any combination
		
		Hashtable<Integer,String> hi = new Hashtable<Integer,String>();
		
		hi.put(1, "one");
		hi.put(2, "two");
		
		
		
		
		

	}

}
