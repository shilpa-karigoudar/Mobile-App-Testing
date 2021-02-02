package PracticeSessions;

public class FindMissingNumber {

	public static void main(String[] args) {

// 1+2+3+4+5=15
		//1+2+4+5=12
		//15-12=3
		
		int a[] = {-1,0,1,2,3,4,5,6,7};
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1;j<=8;j++){
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		int missingNum=sum1-sum;
		System.out.println("Missing Number is :" +missingNum);

	}

}
