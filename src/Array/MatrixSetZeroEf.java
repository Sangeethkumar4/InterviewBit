package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MatrixSetZeroEf {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		Scanner in = new Scanner(System.in);
		int no, no1;
		no = in.nextInt();
		no1 = in.nextInt();
		for(int i=0; i<no; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0; j<no1; j++) {
				list.add(in.nextInt());
			}
			a.add(list);
		  }
		setZeroes(a);
		in.close();
		}

	private static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> columns = new HashSet<Integer>();		
		for(int i=0; i<a.size(); i++) {
			for(int j=0; j<a.get(i).size(); j++) {
				if(a.get(i).get(j) == 0) {
				rows.add(i);
				columns.add(j);
				}
			}
		}
		Iterator<Integer> itr = rows.iterator();
		Iterator<Integer> colItr = columns.iterator();
		while(itr.hasNext()) {
			int no = itr.next();
			for(int i=0; i<a.get(no).size(); i++) {
				a.get(no).set(i, 0);
			}
		}
		while(colItr.hasNext()) {
			int no = colItr.next();
			for(int i=0; i<a.get(no).size(); i++) {
				a.get(i).set(no, 0);
			}
		}
		System.out.println(a);
	}	
}
