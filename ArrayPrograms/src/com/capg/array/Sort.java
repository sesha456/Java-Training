package com.capg.array;

import java.util.Arrays;
import java.util.Collection;

public class Sort {

	public static void main(String[] args) {
		
		int[] arr = {13,9,0,8,78,-9,-8-99,56,47,99};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, Collection.class.reverseOrder());

	}

}
