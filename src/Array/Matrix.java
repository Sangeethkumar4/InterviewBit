package Array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n;
		m = in.nextInt();
		n = in.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		
	}
}
