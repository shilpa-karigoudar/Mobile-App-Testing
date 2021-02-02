package PracticeSessions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinArray {
	
	public static void maxMin(int[] a){
		
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
		System.out.println("The Smallest Number is :" +smallest);
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
	
		int size = s.nextInt();
		
		int b[]=new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++){
			s.nextInt();
		}
		
		maxMin(b);

	}

}
