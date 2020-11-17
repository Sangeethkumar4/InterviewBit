package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

enum type { A, D };

class Hotel{
	int date;
	type arrOrDept;
	public Hotel(int date, type arrType) {
		this.date = date;
		this.arrOrDept = arrType;
	}
}

public class Hotels {	
	public static void main(String[] args) {
		Comparator<Hotel> comp = (d1, d2) -> { 
			if(Integer.compare(d1.date, d2.date) == 0) 
				return d2.arrOrDept.toString().compareTo(d1.arrOrDept.toString());
			else 
				return Integer.compare(d1.date, d2.date);				
			}; 
		boolean flag= true;
		int counter = 0;
		PriorityQueue<Hotel> pq = new PriorityQueue<Hotel>(comp);
		List<Integer> arrive = new ArrayList<Integer>();
		List<Integer> depart = new ArrayList<Integer>();
		int no, K;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			arrive.add(in.nextInt());
		}
		for(int i=0; i<no; i++) {
			depart.add(in.nextInt());
		}
		K = in.nextInt();
		for(int i=0; i<no; i++) {
			pq.add(new Hotel(arrive.get(i), type.A));
		}
		for(int i=0; i<no; i++) {
			pq.add(new Hotel(depart.get(i), type.D));
		}
		while(!pq.isEmpty()) {
			Hotel hotel = pq.poll();
			if(hotel.arrOrDept == type.A) {
				counter++;
			}else {
				counter--;
			}
			if(counter > K) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
