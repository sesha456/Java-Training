package com.capg.loops;

import java.util.Scanner;

public class Sum_of_n_natural_number {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter the number till which you want sum : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 0; i <=n; i++) {
			sum = sum+i;
		}
		System.out.println("The Sum of "+n+" is : " +sum);

	}

}
