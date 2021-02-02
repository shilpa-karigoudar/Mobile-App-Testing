package JavaPrograms;

public class finaliseConcept {

	public static void main(String[] args) {

		finaliseConcept f1= new finaliseConcept();
		
		finaliseConcept f2 = new finaliseConcept();
		f1=null;
		f2=null;
		System.gc();  // clean up
		
	}
	public void finalize(){
		System.out.println("Finalize method"); // automatically finalize method is callled just before the garbage collector method is called
	}
}
