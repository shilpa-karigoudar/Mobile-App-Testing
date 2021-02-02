package OOPConcept2;

public class Car1 {

	//Method hiding ---- 
	public  static void start(){
		System.out.println("Car Start");
	}
	
	public  static void start(int a){
		System.out.println("Car Start with 1 param");
	}
	
	public  static void start(int a,String s){
		System.out.println("Car Start with 2 param");
	}
	
	public void stop(){
		
	}
	
	public void refuel(){
		
	}
}
