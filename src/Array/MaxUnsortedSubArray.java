package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxUnsortedSubArray {
	
	public static int findMin(ArrayList<Integer> A, int x, int y) {
		int min = Integer.MAX_VALUE;
		for(int i=x; i<=y; i++) {
			if(A.get(i) < min) {
				min = A.get(i);
			}
		}
		return min;
	}
	
	public static int findMax(ArrayList<Integer> A, int x) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<=x; i++) {
			if(A.get(i) > max) {
				max = A.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int no, x=-1, y=0;
		boolean flag = true;
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 1, 4, 6, 8, 8, 13, 13, 13, 14, 17, 18, 14));
		ArrayList<Integer> output = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		for(int i=0; i<A.size()-1; i++) {
			if(A.get(i) > A.get(i+1)) {
				flag = true;
				if(x!= -1)
					y = i+1;
				else {					
					x=i;
					y=i+1;					
				}
			}else if(A.get(i) < A.get(i+1)){
				flag = false;
			}else if(A.get(i) == A.get(i+1) && flag) {
				y = i +1;
			}
		}
		if(x !=0 && y !=0) {
			int min = findMin(A, x, y);
			for(int i=0; i<x; i++) {
				if(A.get(i) > min) {
					x = i;
				}
			}
			int max = findMax(A, y);
			for(int i=0; i<A.size(); i++) {
				if(A.get(i) < max) {
					y=i;
				}
			}
			
			output.add(x);
			output.add(y);
		}else {
			output.add(-1);
		}
		System.out.println(output);
	}
}
