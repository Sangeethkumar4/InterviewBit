package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LargestNo {
	
	static class SortByBits implements Comparator<Integer> 
	{ 	   
		@Override
		public int compare(Integer n1, Integer n2) {
			if(n1 ==0 || n2 == 0) {
				return 1;
			}
			int m1 = bits(n1);
			int m2 = bits(n2);
			
			int o1 = (m1 * n2) + n1;
			int o2 = (m2 * n1) + n2;
						
			return o1 > o2 ? 1 : -1;
		} 
	}
	//1, 34, 3, 98, 9, 76, 45, 4}
	public static int bits(int no) {
		int counter = 1;
		while(no > 0) {
			counter = counter * 10;							
			no = no / 10;
		}
		return counter;
	}
	

	public static void main(String[] args) {
		final List<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		int no, zeros = 0;
		String output = "";
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			A.add(in.nextInt());			
		}
		
		for(int i=0; i<A.size(); i++) {			
			array.add(A.get(i));
			if(A.get(i) == 0) {
				zeros++;
			}
		}
		
		if(zeros == A.size()){
			array.removeAll(array);
			array.add(0);
		}
		
		Collections.sort(array, new SortByBits());				
		for(int i=0; i<array.size(); i++) {
			output = output + String.valueOf(array.get(i));
		}
		System.out.println(output);
	}
}
