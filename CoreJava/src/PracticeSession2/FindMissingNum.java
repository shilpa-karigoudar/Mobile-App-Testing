package PracticeSession2;

public class FindMissingNum {

	public static int missingNum(int b[]){
		int sum1=0;
		for(int i=0;i<b.length;i++){
			sum1=sum1+b[i];
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=0;i<=6;i++){
			sum2=sum2+i;
		}
		System.out.println(sum2);
		return sum2-sum1;
	}
	public static void main(String[] args) {

		int a[]={1,2,4,5,6};
		
		System.out.println(missingNum(a));

	}

}
