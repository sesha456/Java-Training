package com.capg.loops;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the radius of the circle : ");
		Scanner input = new Scanner(System.in);
		float r = input.nextFloat();
		
		double area = Math.PI*(r*r);
		
		System.out.println("The area of the circle with radius "+r+" is : "+area);
		
		input.close();	
		
	}

}
