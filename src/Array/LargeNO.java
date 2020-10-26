package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LargeNO {
	
	static class SortByBits implements Comparator<String> 
	{ 	   
		public int compare(String n1, String n2) {
			String x = n1 + n2;
			String y = n2 + n1;
			return x.compareTo(y) > 0 ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		final List<Integer> A = new ArrayList<Integer>();
		ArrayList<String> array = new ArrayList<String>();
		int no, zeros = 0;
		String output = "";
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			A.add(in.nextInt());			
		}
		
		for(int i=0; i<A.size(); i++) {			
			if(A.get(i) == 0) {
				zeros++;
			}
			array.add(String.valueOf(A.get(i)));
		}
		
		if(zeros == A.size()){
			array.removeAll(array);
			array.add("0");
		}
		
		
		Collections.sort(array, new SortByBits());				
		for(int i=0; i<array.size(); i++) {
			output = output + array.get(i);
		}
		System.out.println(output);
	}
}
