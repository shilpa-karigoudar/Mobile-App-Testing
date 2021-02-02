package JavaPrograms;

public class ConstructorWithThisKeyWord {
// Class Vars
	String name;
	int age;
	String name1;
	
	public ConstructorWithThisKeyWord(String name,int age){
		this.name=name;                                      // this is used to poing global vars
		this.age=age;
		name1=name;
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {

		ConstructorWithThisKeyWord obj = new ConstructorWithThisKeyWord("Tom",30);

	}

}
