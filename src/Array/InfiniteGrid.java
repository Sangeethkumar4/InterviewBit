package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteGrid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int n1, n2;
		n1 = in.nextInt();
		
		for(int i=0; i< n1; i++) {
			list1.add(in.nextInt());
		}
		for(int i=0; i< n1; i++) {
			list2.add(in.nextInt());
		}
		
		System.out.println(findNoOfSteps(list1, list2));
	}

	private static int findNoOfSteps(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		int counter = 0;
		for(int i=0; i< list1.size()-1; i++) {
			int x1 = list1.get(i);
			int y1 = list2.get(i);
			int x2 = list1.get(i+1);
			int y2 = list2.get(i+1);
			counter += findSteps(x1, y1, x2, y2);
		}
		return counter;
	}

	private static int findSteps(int x1, int y1, int x2, int y2) {
		int counter = 0;
		while(!(x1==x2 && y1 == y2)) {
		if(x1 < x2) {
			x1++;
		}
		if(x1 > x2) {
			x1--;
		}
		if(y1 < y2) {
			y1++;
		}
		if(y1 > y2) {
			y1--;
		}
		counter++;
	}
	return counter;
	}
}
