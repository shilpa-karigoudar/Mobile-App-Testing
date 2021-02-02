package OOPConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x="100";
		System.out.println(x+20);
		int xi = Integer.parseInt(x);
		
		System.out.println(xi+20);
		//Boolean.parseBoolean();

    //Integer,double,character,Boolean
		
		//String to Double
		
		String d="23.44";
		double dd = Double.parseDouble(d+10);
		System.out.println(dd);
	
	   //String to Char
		String b="True";
		boolean bb = Boolean.parseBoolean(b);
		
		
		//Integer to String Conversion
	
		int j=200;
		
		String jj= String.valueOf(j);
		
		String u="100A";  
		
		Integer.parseInt(u); // NumberFormatException  - when non pure int is converted from String to int
		
		
	
	
	}

}
