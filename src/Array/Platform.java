package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Interval{
	int start;
	int end;
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

class IntervalComparator implements Comparator<Interval>{
	@Override
	public int compare(Interval i1, Interval i2) {		
		return i1.end - i2.end > 0 ? 1 : -1;
	}
}

public class Platform {	
	public static void main(String[] args) {
	int outputSize = 1;
	PriorityQueue<Interval> pq = new PriorityQueue<Interval>(new IntervalComparator());
	ArrayList<Integer> arrival = new ArrayList<Integer>();
	ArrayList<Integer> departure = new ArrayList<Integer>();
	int no;
	Scanner in = new Scanner(System.in);
	no = in.nextInt();
	for(int i=0; i<no; i++) {
		System.out.println("Enter arrival time:");
		arrival.add(in.nextInt());
		System.out.println("Enter departure time:");
		departure.add(in.nextInt());
	}
		pq.add(new Interval(arrival.get(0), departure.get(0)));
		for(int i=1; i<no; i++) {
			 if(pq.peek().end <= arrival.get(i)) {
				pq.poll();				
			}
			pq.add(new Interval(arrival.get(i), departure.get(i)));
			if(pq.size() > outputSize) {
				outputSize = pq.size();
			}
		}
		System.out.println("No of req platforms:" + outputSize);
	}
}
