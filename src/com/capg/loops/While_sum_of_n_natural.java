package com.capg.loops;

import java.util.Scanner;

public class While_sum_of_n_natural {

	public static void main(String[] args) {
		
		int sum = 0,i = 0;
		System.out.println("Enter the Value : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n>=i) {
			sum= sum+i;
			i++;
		}
		
		System.out.println("The Sum of "+n+" is : " +sum);

	}

}
