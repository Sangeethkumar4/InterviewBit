package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortWithSquares {

	
	 public static void main(String[] args) {
		 List<Integer> A = new ArrayList<Integer>(Arrays.asList( -855, -847, -747, -708, -701, -667, -666, -618, -609, -536, -533, -509, -500, -396, -336, -297, -284, -229, -173, -173, -132, -38, -5, 35, 141, 169, 281, 322, 358, 421, 436, 447, 478, 538, 547, 644, 667, 673, 705, 711, 718, 724, 726, 811, 869, 894, 895, 902, 912, 942, 961));
		 Scanner in = new Scanner(System.in);
//			int no = in.nextInt();
//			for(int i=0; i<no; i++) {
//				A.add(in.nextInt());		
//			}
	        Comparator<Integer> comp = ((n1, n2) -> Integer.compare(n1,n2));
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comp);
	        ArrayList<Integer> output = new ArrayList<Integer>();
	        for(int i=0; i<A.size();i++){
	            int n = A.get(i) * A.get(i);
	           pq.add(n);
	        }
	        while(!pq.isEmpty()) {
	        	output.add(pq.poll());
	        }
	    }
}
