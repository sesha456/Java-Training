package com.capg.loops;

import java.util.Scanner;

public class EvenOdd_Check {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number : ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		if(n%2==0){
			System.out.println("The Number is Even");
		}
		else {
			System.out.println("The Number is Odd");
		}
		input.close();
		

	}

}
