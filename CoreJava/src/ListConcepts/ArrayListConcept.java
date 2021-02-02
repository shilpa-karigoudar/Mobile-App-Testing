package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String args[]){
		
		
		int a[]=new int[5]; // static array - size is fixed
		
		ArrayList ar = new ArrayList();
		ArrayList ar1 = new ArrayList();
		
		ar.add(10);
		ar.addAll(ar1);
		
		int size = ar.size();
		
		ar.add(40);
		
		ar.add(50);
		
		// we can store n number of objects
		// can contain duplicate values
		// it maintains insertion order
		// not synchonized
		// random access- to fetch any elements- becoz it stores the values on the basis of indexes
		// to print all the values of arrayList we use for loop OR Iterator
		
		for(int i=0;i<=ar.size()-1;i++){
			System.out.println(ar.get(i));
		}
		
		//non generic vs generics
		
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		//Generics in Java - the type of data to be allowed in the ArrayList
		
		ArrayList<String> ar3= new ArrayList<String>();
		
		//ArrayList<E> ar3= new ArrayList<E>();
	
		Employee e1= new Employee("Shilpa", 28, "CSE");
		Employee e2= new Employee("Naveen", 27, "QA");
		Employee e3= new Employee("Kiran", 30, "Dev");
		
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()){
			
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		//addAll
		
		
	}
}
