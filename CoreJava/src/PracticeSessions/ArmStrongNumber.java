package PracticeSessions;

public class ArmStrongNumber {
	
	//153
	//1*1*1=1
	//5*5*5=125
	//3*3*3=27

	//125+27+1=153
	
	public static void isArmStrongNum(int num){
		
		int rem=0;
		int temp;
		temp=num;
		int sum=0;
		while(num>0){
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num=num/10;
		}
		
		if(temp==sum){
			System.out.println("is a ArmStrong Number");
		}
		else
			System.out.println("is not a ArmStrong Number");
	}
	public static void main(String[] args) {

		isArmStrongNum(153);
		isArmStrongNum(370);
		isArmStrongNum(0);
		isArmStrongNum(1);
	}

}
