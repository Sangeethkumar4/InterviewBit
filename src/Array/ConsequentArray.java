package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsequentArray {

	public static void main(String[] args) {
		int no;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max_sum_here=0, max_sum = 0;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			list.add(in.nextInt());
		}
				 
	        boolean flag = false;
	        max_sum = list.get(0);
	        for(int i=0; i<list.size(); i++) {
	             if(list.get(i) > 0){
	                 flag = true;
	                 break;
	             }
	             if(i != list.size()){
	                 if(max_sum < list.get(i)){
	                     max_sum = list.get(i);
	                 }
	             }
	        }
	        
	      if(flag == true) {
		for(int i=0; i<no; i++) {
			max_sum_here = max_sum_here+ list.get(i);
			if(max_sum_here < 0) {
				max_sum_here = 0;
			}
			if(max_sum_here > max_sum) {
				max_sum = max_sum_here;
			}
		}
	      }
		System.out.println(max_sum);
	}
}
