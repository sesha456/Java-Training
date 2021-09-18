package com.capg.patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int n = input.nextInt();
		for (int i = n; i > 0;i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		input.close();

	}

}
