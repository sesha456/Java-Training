package com.capg.loops;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		int principal = input.nextInt();
		System.out.println("Enter the Rate of Interest : ");
		float rate = input.nextFloat();
		System.out.println("Enter the Number of years : ");
		int year = input.nextInt();
		
		float r = principal*(1+(rate/100));
		double ci = Math.pow(r, year);
		
		System.out.println("The Coupound Interest for a Principal of "+principal+" with a rate of interest "+rate+" for "+year+" Many years is "+ci);
		input.close();

	}

}
