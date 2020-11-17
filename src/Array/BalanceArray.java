package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BalanceArray {
	
	public static boolean isBalanced(ArrayList<Integer> list) {
		int sum1 = 0, sum2 =0;
		for(int i=0; i<list.size(); i+=2) {
			sum1 = sum1+list.get(i);
		}
		for(int i=1; i<list.size(); i+=2) {
			sum2 = sum2+list.get(i);
		}
		return sum1 == sum2;
	}

	 public static void main(String[] args) {
		 int counter = 0;
		 ArrayList<Integer> A = new ArrayList<Integer>();
		 Scanner in = new Scanner(System.in);
			int no = in.nextInt();
			for(int i=0; i<no; i++) {
				A.add(in.nextInt());		
			}
			for(int i=0; i<no; i++) {
				int removedElement = A.remove(i);	
				if(isBalanced(A)) {
					counter++;
				}
				A.add(i, removedElement);
			}
			System.out.println(counter);
	 }
}
