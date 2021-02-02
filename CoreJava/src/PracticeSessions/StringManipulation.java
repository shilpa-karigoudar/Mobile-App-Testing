package PracticeSessions;

public class StringManipulation {

	public static void main(String[] args) {


		 String str="The Rains have started here";
		 
		 String str1="The Rains have started Here";
		
		 System.out.println(str.length());
		
		 System.out.println(str.charAt(5));
		 
		 System.out.println(str.indexOf('s'));  //first s
		 
		 System.out.println(str.indexOf('s',str.indexOf('s')+1));// index of second s
		 
		 System.out.println(str.indexOf("have"));
		 
		 System.out.println(str.indexOf("hello"));
		 
		 // String comp
		 
		 System.out.println(str.equals(str1)); //case sensitive
		 
		 System.out.println(str.equalsIgnoreCase(str1));
		 
		 //substring
		 
		 System.out.println(str.substring(5));
		 
		 System.out.println(str.substring(0,7));
		 
		 //trim
		 
		 String s ="    Hello World  ";  // trim method is used for before and after spaces
		 
		 String s1= "Hello World Test This";
		 
		 System.out.println(s.trim());
		 
		 System.out.println(s.replace(" ", "d"));
		 
		 // split
		 
		 String[] words = s1.split(" ");
		 for(int i=0;i<words.length;i++){
		 System.out.println(words[i]);
		 }
		 
		 String s2="cares";
		 
		 System.out.println(s1.concat(s2));
		 
		 String x="Hello";
		 String y="World";
		 
		 int a=100;
		 int b=200;
		 
		 System.out.println(x+y);
		 System.out.println(a+b);
		 
		 System.out.println(x+y+a+b);
		 
		 System.out.println(a+b+x+y);
	}

}
