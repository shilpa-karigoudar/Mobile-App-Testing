package OOPConcept2;

public class OverloadStaticMethod {

	public static void main(String[] args) {


		BMW1 b=new BMW1();
		b.start(); // warning as its a static methos and it has to be called by classname
		
		Car1.start(10);
		
		Car1.start(10,"sh");
		
		b.stop();
		
		b.refuel();
		
		

	}

}
