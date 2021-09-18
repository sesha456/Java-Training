package com.capg.loops;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		
		int fact = 1;
		System.out.println("Enter the number for which you want facyorial : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = n; i > 0; i --) {
			fact = fact *i;
		}
		
		System.out.println("Factorial of "+n+" is : "+fact);

	}

}
