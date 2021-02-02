package PracticeSessions;

import java.util.Arrays;

public class MinAndMaxNumbers {

	public static void main(String[] args) {


		int a[]={1,-10,30,4,-20,15};
		
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++){
			
				if(a[i]>largest){
					largest=a[i];
				
			}
				else if(a[i]<smallest){
					smallest=a[i];
				}
		}
		
		System.out.println(" Given Array is : " +Arrays.toString(a));
		System.out.println("The Largest Number is :" +largest);
		System.out.println("The Smallest Number is :" + smallest);
		

	}

}
