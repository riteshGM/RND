package com.appname.impprogs;

/**
 * Create A Program to Transpose 2D array in Java
 * 
 * @author Ritesh Mansukhani
 *
 */

public class Array_Transpose2DArray {

	public static void main(String[] args) {

		int array[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int transpose[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = array[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
