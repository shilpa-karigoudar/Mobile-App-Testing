package JavaPrograms;

public class ArrayConcept {

	public static void main(String[] args) {


		int i[]=new int[4];
		// i[0],i[1]...i[3]
		
		//lowest index is -0
		//upper index is -n-1
		//size is n-1
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		
		System.out.println(i[2]);
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		//System.out.println(i[4]); // location does not exists //ArrayIndexOutOfBoundsException


	
	double d[] = new double[5];
	d[0]=11.11;
	d[1]=12.12;
	d[2]=13.13;
	d[3]=14.14;
	d[4]=15.15;
	
	char c[]= new char[5];
	
	Boolean b[]=new Boolean[1];
	
	String s[]= new String[5];
	s[0]="Hello";
	s[1]="World";
	
	// one dimensional Array
	// 1.size is fixed   - To Over come this we use collections
	// similar data type can be stored - to overcome this we use object array
	
	//Object Array - Object is superclass
	
	Object obj[] = new Object[5];
	obj[0]="Tom";
	obj[1]="28";
	obj[2]="20/02/1992";
	obj[3]='M';
	obj[4]="London";
	
	System.out.println(obj[4]);
	
	
}
}