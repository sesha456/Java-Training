package com.capg.loops;

import java.util.Scanner;

public class While_factorial {

	public static void main(String[] args) {
		int fact = 1, i =1;
		System.out.println("Enter the number for which you want facorial : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n>0) {
			fact = fact*n;
			n--;
		}
		
		System.out.println("Factorial of "+ n +" is : "+fact);

	}

}
