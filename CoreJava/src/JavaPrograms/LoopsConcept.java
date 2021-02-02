package JavaPrograms;

public class LoopsConcept {

	public static void main(String[] args) {


		int i=0;
		while (i<=10){ 
// disadvantage of while loop is- when condition is not mentioned in the while loop it will generate infinite loop
			System.out.println(i);
			i++;
		}

		
		for(int j=0;j<=10;j++){
			System.out.println(j);
		}
		
		for(int k=10;k>=0;k--){
			System.out.println(k);
		}
	}

}
