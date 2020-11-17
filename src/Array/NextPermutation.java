package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		int no;
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			A.add(in.nextInt());
		}
		System.out.println(A.size());
		for(int i=A.size()-2; i>=1; i--) {
			if(A.get(i+1) > A.get(i)) {
				int num = A.get(i);
				A.set(i, A.get(i+1));
				A.set(i+1, num);
				flag = true;
			}
			if(flag) {
				for(int j=i+1; j<A.size()-1; j++) {
					int num = A.get(j);
					A.set(j, A.get(j+1));
					A.set(j+1, num);
					flag = true;
				}
				break;
			}
		}
		System.out.println(A);
	}
}
