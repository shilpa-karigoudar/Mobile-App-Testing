package PracticeSession2;

public class MaxAndMinNum {
	
	public static void min(int b[]){
		
		int min=b[0];
		
		for(int i=1;i<b.length;i++){
			if(b[i]<b[0]){
				
				b[0]=b[i];
			}
		}
		
		System.out.println(b[0]);
		
	}

	public static void main(String[] args) {

		int a[]={1,5,7,3,2};
		min(a);

	}

}
