package Sorting;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		int[] array;
		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		array = new int[no];
		for(int i=0; i<no; i++) {
			array[i] = in.nextInt();
		}
		selectionSort(array);
		print(array);
	}

	private static void selectionSort(int[] array) {
		int length = array.length;
		int smallest;
		
		for(int i=0; i<array.length; i++) {
			smallest = i;
			for(int j=i+1; j< array.length; j++) {
				if(array[i] > array[j]) {
					smallest = j;
				}
			}
			swap(array, i, smallest);
		}		
	}

	private static void swap(int[] array, int i, int smallest) {
		int temp = array[i];
		array[i] = array[smallest];
		array[smallest] = temp;
	}

	private static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}		
		System.out.println();
	}

}
