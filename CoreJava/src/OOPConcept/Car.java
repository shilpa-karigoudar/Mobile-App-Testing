package OOPConcept;

public class Car {

	int mod;
	int wheel;
	public static void main(String[] args) {
		
		// new Car() - is object
		// a,b are references of the object
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=6;
		
		c.mod=2014;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		
		c.mod=20;
		System.out.println(c.mod);
		
		System.out.println(a.mod);
		
		
		
		

	}

}
