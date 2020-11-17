package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSetZero {
	
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
	        for(int i=0; i<a.size();i++) {
	        	for(int j=0; j<a.get(i).size();j++) {
	        		if(a.get(i).get(j) == 0) {
	        			setZero(a, i, j);
	        		}
	        	}
	        }
	        for(int i=0; i<a.size();i++) {
	        	for(int j=0; j<a.get(i).size();j++) {
	        		if(a.get(i).get(j) == -1) {
	        			a.get(i).set(j, 0);
	        		}
	        	}
	        }
	        System.out.println(a);
	}

	private static void setZero(ArrayList<ArrayList<Integer>> a, int i, int j) {
		for(int itr = 0; itr < a.size();itr++) {
			if(a.get(i).get(itr) == 0) {				
				continue;
			}
				a.get(i).set(itr, -1);
		}
		for(int itr = 0; itr < a.get(i).size(); itr++) {
			if(a.get(itr).get(j) == 0) {
				continue;
			}
			a.get(itr).set(j, -1);
		}		
	}

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
		}		
	}
