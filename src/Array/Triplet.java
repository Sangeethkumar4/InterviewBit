package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("0.234022", "0.051717", "0.820402", "0.492629", "0.004825", "0.589073" ));
		Comparator<Float> floatComp = ((a,b) -> Float.compare(a, b));
		PriorityQueue<Float> pq = new PriorityQueue<Float>(floatComp);
		int no;
		float count = 0;
		Scanner in = new Scanner(System.in);
//		no = in.nextInt();
//		for(int i=0; i<no; i++) {
//			arrayList.add(in.next());
//		}
		for(int i=0; i<arrayList.size(); i++) {
			pq.add(Float.parseFloat(arrayList.get(i)));
		}
		for(int i=0; i<3; i++) {
			 count = count + pq.poll();
		}
		if(count > 1 && count < 2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
