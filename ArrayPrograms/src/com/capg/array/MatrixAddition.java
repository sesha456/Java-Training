package com.capg.array;

public class MatrixAddition {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int matrix1[][] = {{7,8,9},{4,5,6},{1,2,3}};
		
		int[][] multiply_mat = new int[arr.length][matrix1.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				multiply_mat[i][j] = arr[i][j] + matrix1[i][j];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(multiply_mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
