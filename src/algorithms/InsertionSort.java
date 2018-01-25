package algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {3, 5, 7, 11, 13, 2, 9, 6};
		insertionSortAllInOne(array);
		System.out.println(Arrays.toString(array));
	}
	

	//version 1 with 2 functions
	static void insert(int[] arr, int rightIndex, int value) {
		int i;
		for (i = rightIndex; i >= 0 && arr[i] > value; i--) {
			arr[i + 1] = arr[i];
		}
		arr[i + 1] = value;
	}
	
	static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			insert(arr, i - 1, arr[i]);
		}
	}
	

	//version 2 with one function
	static void insertionSortAllInOne(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	      
}
