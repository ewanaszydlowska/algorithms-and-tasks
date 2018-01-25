package algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {4,9,1,45,28,82,1,5,9};
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
	}
	
	//non-oprimized function
	static void bubbleSortN(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr [j + 1] = temp;
				}
			}
		}
	}

	//optimized function
	static void bubbleSort(int[] arr) {
		int temp;
		int n = arr.length - 1;
		while (n > 0) {
			int last = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					last = j;
				}
			}
			n = last;
		}
	}
}