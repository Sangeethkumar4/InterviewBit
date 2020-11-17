package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxDistance {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(34, 8, 10, 3, 2, 80, 30, 33, 1));
		int[] maxFromEnd = new int[A.size()];
		int[] minFromStart = new int[A.size()];
		int no, max = -1;
		//Scanner in = new Scanner(System.in);//[34, 8, 8, 3, 2, 2, 2, 2, 1]
		Arrays.fill(maxFromEnd, -1);//[80, 80, 80, 80, 80, 80, 33, 33, 1]
		maxFromEnd[A.size()-1] = A.get(A.size()-1);
		for(int i=A.size()-2; i>=0; i--) {
			maxFromEnd[i] = Math.max(A.get(i), maxFromEnd[i+1]);			
		}
		minFromStart[0] = A.get(0);
		for(int i=1; i<A.size(); i++) {
			minFromStart[i] = Math.min(A.get(i), minFromStart[i-1]);
		}
		
		for(int i=0,j=0; i<A.size(); ) {
			if(minFromStart[i] < maxFromEnd[j]) {
				max = Math.max(max, j-i);
				j++;
			}else {
				i++;
			}
		}
		System.out.println(max);
	}
}
