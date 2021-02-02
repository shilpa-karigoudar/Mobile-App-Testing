package JavaPrograms;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(b>a){
			System.out.println("b is greater than a");
		}
		else if (a>b){
			System.out.println("a is greater than b");
		}

		//Comparison Operators- > < >= <= == =
		
		int c=30;
		int d=40;
		
		if (c==d){
			System.out.println("C and D are equal");
		}
		else {
			System.out.println("C and D are not equal");
		}
	//nested if else
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		if (a1>b1 && a1>c1){
			System.out.println("a1 is the greatest number");
		}
		
		else if (b1>c1 && b1>a1){
			System.out.println("b1 is the greatest number");
		}
		else if (c1>a1 && c1>b1){
			System.out.println("c1 is the greatest number");
		}
		
		else{
			System.out.println("All the numbers are greatest");
		}
	
	}
	

}
