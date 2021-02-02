package PracticeSessions;

public class Swap2String {

	public static void main(String[] args) {

String a="Hello";
String b="World";

	System.out.println("Before Swapping:");
	System.out.println("The Value of A is : "+a);
	System.out.println("The Value of A is :" +b);
	
	// Append a and b
	
	a=a+b;// helloworld
	
	//Store initial string a in string b
	
	b=a.substring(0,a.length()-b.length());
	
	a=a.substring(b.length());
	
	System.out.println("After Swapping:");
	System.out.println("The Value of A is : "+a);
	System.out.println("The Value of A is :" +b);
	
	

	}

}
