package JavaPrograms;
import java.util.ArrayList;
 	
public class ArrayListConcept {

	public static void main(String[] args) {


		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Shilpa");
		ar.add("2002/10/2");
		ar.add(12.33);
		ar.add('A');
	
	System.out.println(ar.size());
	
	System.out.println(ar.get(4));
	
//	System.out.println(ar.get(20)); // arrayIndexOutOfBoundException
	
	for(int i=0;i<=ar.size()-1;i++){
		System.out.println(ar.get(i));
	}

	ArrayList<Integer> ai = new ArrayList<Integer>();
	
	ai.add(10);
	
	//ai.add("char");
	
	ArrayList<String> as= new ArrayList<String>();
	
	as.add("Shilpa");
	
	as.remove(4);
	

	
	
	}

}
