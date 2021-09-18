package com.capg.array;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{3,5,6}};
		
		int matrix1[][] = {{7,8},{1,8},{2,4}};
		
		int[][] multiply_mat = new int[arr.length][matrix1.length];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				multiply_mat[i][j] = 0;
				for (int k=0; k<3;k++) {
				multiply_mat[i][j] += arr[i][k]*matrix1[k][j];
				}
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
