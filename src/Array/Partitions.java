package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Partitions {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int no, level1 = 0, level2=0, level3 =0, counter = 0;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		for(int i=0; i<no; i++) {
			array.add(in.nextInt());			
		}
		for(int i=0; i<array.size()-2;i++) {
				level1 = level1 + array.get(i);
				level2 =0;
			for(int j=i+1; j<array.size()-1; j++) {
					level2 = level2 + array.get(j);					
					level3 = 0;
					if(level1 == level2) {
						for(int k=j+1; k < array.size(); k++) {
							level3 += array.get(k);							
					}
						if(level2 == level3) {
							counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
