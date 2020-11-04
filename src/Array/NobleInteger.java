package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class NobleInteger {
	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList( -4, -2, 0, -1, -6));        
	int no;
	Scanner in = new Scanner(System.in);
	int counter = 0;
	Collections.sort(list);
	
	for(int i=0; i<list.size(); i++) {
			int n = list.get(i);
			int size = list.size();
			if(n == 0 && i+1 == size) {
				counter++;
			}
			if((size - (i+1)) == n && (i+1)!=size && list.get(i+1) > list.get(i)) {				
			counter++;
		}
	}
	System.out.println(counter);
  }
}
