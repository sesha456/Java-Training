package com.capg.loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = input.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
		input.close();
		

	}

}
