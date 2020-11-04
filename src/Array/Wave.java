package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList( 5, 1, 3, 2, 4));
		int no, size;
		Scanner in = new Scanner(System.in);
		size = A.size();
		Collections.sort(A);
		for(int i=0;i<size;i++) {
			if(i+1 <= size-1) {
				Collections.swap(A, i, i+1);
				i+=1;
			}
		}
		System.out.println(A);
	}
}
