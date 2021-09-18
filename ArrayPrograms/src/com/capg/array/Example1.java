package com.capg.array;

public class Example1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int arr1[] = {1,2,3,4,5,6,7,8,9}; 
		
		for (int a:arr) {
			System.out.println(a);
		}
		for (int a:arr1) {
			System.out.println(a);
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println(arr1[i]);
		}
		

	}

}
