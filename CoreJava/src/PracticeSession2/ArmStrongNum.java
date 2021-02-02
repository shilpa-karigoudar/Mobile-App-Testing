package PracticeSession2;

public class ArmStrongNum {

	public static void isArMStrongNum(int num){
		
		int rem=0;
		int temp=num;
		int sum=0;
		while(num>0){
			rem=num%10;
			sum=(int) (sum+ Math.pow(rem,3));
			num=num/10;
		}
		
		if(sum==temp){
			System.out.println(temp +" Is a ArmStrong Number");
		}
		else 
			System.out.println(temp +" Is not a ArmStrong Number");
	}
	public static void main(String[] args) {


		isArMStrongNum(153);

	}

}
