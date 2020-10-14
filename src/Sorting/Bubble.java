package Sorting;

import java.util.Scanner;

public class Bubble {
	
	private static void bubbleSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j< array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			print(array);
		}
	}

	public static void main(String[] args) {
		int[] array;
		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		array = new int[no];
		for(int i=0; i<no; i++) {
			array[i] = in.nextInt();
		}
		bubbleSort(array);
		print(array);
	}

	private static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}		
		System.out.println();
	}
}
