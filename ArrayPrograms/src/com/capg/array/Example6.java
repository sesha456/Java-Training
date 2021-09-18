package com.capg.array;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		
		int[] Array1= {1,2,3,4};
		
		int[] Array2 = {4,5,6,7};
		
		int f1 = Array1.length;
		int s1 = Array2.length;
		
		int result[] = new int[f1+s1];
		
		int debug_variable = result.length;
		System.arraycopy(Array1, 0, result, 0, f1);
		System.arraycopy(Array2, 0, result, f1, s1);
		System.out.println(Arrays.toString(result));
		

	}

}
