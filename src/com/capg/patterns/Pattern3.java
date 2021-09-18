package com.capg.patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int n = input.nextInt();
		for (int i = 1; i <= n;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1;i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		input.close();

	}

}
