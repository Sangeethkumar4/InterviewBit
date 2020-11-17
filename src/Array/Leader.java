package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		int no;
		List<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			A.add(in.nextInt());		
		}
		for(int i=A.size()-1; i>=0; i--) {
			if(pq.isEmpty()) {				
				output.add(A.get(i));
			}else {
				int maxElement = pq.peek();
				if(maxElement < A.get(i)) {
					output.add(A.get(i));
				}
			}
			pq.add(A.get(i));
		}
		System.out.println(output);
	}
}
