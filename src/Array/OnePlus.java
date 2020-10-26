package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class OnePlus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int n1;
		 boolean flag = true;
		 n1 = in.nextInt();
			
			for(int i=0; i< n1; i++) {
				list.add(in.nextInt());
			}
			
			for(int i = 0; i< list.size()-1;) {
				if(list.get(i) == 0) {
					list.remove(i);
					i=0;
				}
				else {
					break;
				}
			}
			
			for(int i = list.size()-1; i>=0 && flag == true; i--) {
				int count = list.get(i);
				count = count + 1;
				if(count == 10) {
					list.set(i, 0);
				}
				else {
					list.set(i, count);
					flag = false;
					break;
				}
			}
			if(flag == true) {
				list.add(0, 1);
			}
			System.out.println(list);
	} 
}
