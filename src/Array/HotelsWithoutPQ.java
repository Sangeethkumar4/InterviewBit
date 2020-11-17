package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HotelsWithoutPQ {

	public static void main(String[] args) {		
		boolean flag= true;
		int counter = 0, i, j, numOfRooms;
		List<Integer> arrive = new ArrayList<Integer>();
		List<Integer> depart = new ArrayList<Integer>();
		int no, K;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();		
		for(i=0; i<no; i++) {
			arrive.add(in.nextInt());
		}
		for(i=0; i<no; i++) {
			depart.add(in.nextInt());
		}
		numOfRooms = in.nextInt();
		Collections.sort(arrive);
		Collections.sort(depart);
		int arrivalCount = arrive.size();
		int deptCount = depart.size();
		i=0; j=0;
		while(i < arrivalCount && j<deptCount) {
			if(arrive.get(i) < depart.get(j)) {
				counter++;
				i++;
			}
			else if(arrive.get(i) >= depart.get(j)) {
				counter--;
				j++;
			}
			if(counter > numOfRooms) {
				flag = false;
				break;
			}			
		}
		System.out.println(flag);
	}
}
