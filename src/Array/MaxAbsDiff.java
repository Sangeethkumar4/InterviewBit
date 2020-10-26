package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAbsDiff {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int no, output = -1;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			array.add(in.nextInt());			
		}
		for(int i=0; i<array.size(); i++) {
			for(int j=i+1; j<array.size(); j++) {
				int n = Math.abs(array.get(i) - array.get(j)) + Math.abs(i-j);
				if(output < n) {
					output = n;
				}
			}
		}
		System.out.println(output);
	}
}
