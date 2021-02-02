package JavaPrograms;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//++
		//--
		
		int i=1;
		 int j=i++; //post increment
		 
		 System.out.println(i +" "+j);

		 int a=1;
		 int b=++a; //pre increment

		 System.out.println(a+" "+b);
		 
		 int m=2;
		 
		 int n=m--; //post decrement
	
		 System.out.println(m+" "+n);
		 
		 int p=3;
		 int q=--p; //pre decrement
		 System.out.println(p+" "+q);
	}

}
