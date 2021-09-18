package com.capg.loops;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int i,m=0,temp=0;      
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = input.nextInt();
		m=n/2;
		if (n<=0) {
			System.out.println("Invalid Number");
			System.exit(0);
		} 
		if(n==0||n==1){  
			System.out.println("is not prime number");      
		}
		else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println("is not prime number");      
					temp=1;      
					break;      
				}      
			}      
			if(temp==0)  {
				System.out.println("is prime number"); 
			}  
			
		}
		input.close();
	}

}
