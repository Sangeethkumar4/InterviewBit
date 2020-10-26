package Sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		int[] array;
		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		array = new int[no];
		for(int i=0; i<no; i++) {
			array[i] = in.nextInt();
		}
		mergeSort(array, 0, array.length-1);
		print(array);
	}
	
	private static void mergeSort(int[] array, int l, int r) {
		if(l < r) {
			int mid = (l+r)/2;
			mergeSort(array, l, mid);
			mergeSort(array, mid+1, r);
			merge(array, l, mid, r);
		}
	}
	
	private static void merge(int[] array, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r-mid;
		
		int[] array1 = new int[n1];
		int[] array2 = new int[n2];
		
		int i,j;
		
		for(i=0 ; i < n1; i++) {
			array1[i] = array[l+i];
		}
		
		for(i=0; i <n2; i++) {
			array2[i] = array[mid+1+i];
		}
		
		i=0; j=0; int k = l;
		
		while(i < n1 && j< n2) {
			if(array1[i] < array2[j]) {
				array[k] = array1[i];
				i++;
			}else {
				array[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			array[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			array[k] = array2[j];
			j++;
			k++;
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
