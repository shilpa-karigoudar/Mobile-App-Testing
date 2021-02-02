package PracticeSessions;

public class RemoveSplCharsInString {

	public static void main(String[] args) {


		String str = "@#$% Name1 A#$%^&";
		
		String s1="cjdskc dsjkc e2342123454 !@#$%^&";
		
		//Regular expression ![A-z,a-z,0-9]

		str=str.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(str);
		System.out.println(s1);
	}

}
