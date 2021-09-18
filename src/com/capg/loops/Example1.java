package com.capg.loops;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number of times you want to Print : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Welcome");
		}

	}

}
