package com.capg.array;

public class MinMax {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,-4,5,6,7,8,98};
		int max = arr[0],min = arr[0];
		
		for (int i = 0; i<arr.length;i++) {
			if (max<arr[i])
				max = arr[i];
		}
		for (int i = 0; i<arr.length;i++) {
			if (min>arr[i])
				min = arr[i];
		}
		System.out.println("Minimum in the array is : "+min);
		System.out.println("Minimum in the array is : "+max);
	}

}
