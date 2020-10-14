package Sorting;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		int[] array;
		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		array = new int[no];
		for(int i=0; i<no; i++) {
			array[i] = in.nextInt();
		}
		insertionSort(array);
		print(array);
	}

	private static void insertionSort(int[] array) {
		for(int i=0; i< array.length; i++) {
			for(int j=0; j<i; j++) {
				if(array[i] < array[j]) {
					swap(array, i, j);
				}
			}
		}
		
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}		
		System.out.println();
	}
}
