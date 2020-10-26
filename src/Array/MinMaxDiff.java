package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxDiff {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int no, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			array.add(in.nextInt());
		}
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) > max) {
				max = array.get(i);
			}
			if(array.get(i) < min) {
				min = array.get(i);
			}
	}
		System.out.println(max+min);
	}
}
