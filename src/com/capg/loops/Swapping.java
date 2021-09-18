package com.capg.loops;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		System.out.println("Enter the value of i : ");
		System.out.println("Enter the value of j : ");
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		int j = input.nextInt();
		int temp = 0;
		
		temp = i;
		i=j;
		j=temp;
		
		System.out.println("After Swap:i="+i+" and j="+j);
				

	}

}
