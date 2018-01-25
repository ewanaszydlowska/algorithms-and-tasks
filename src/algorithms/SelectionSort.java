package algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] testArray = {7, 9, 4, 8, 2, 11, 17, 1};
		selectionSort(testArray);
		System.out.println(Arrays.toString(testArray));
	}
	
	static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
	static int indexOfMinimun(int[] arr, int startIndex) {
		int minValue = arr[startIndex];
		int minIndex = startIndex;
		for (int i = minIndex + 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	static void selectionSort(int[] arr) {
		int value;
		for (int i = 0; i < arr.length; i++) {
			value = indexOfMinimun(arr, i);
			swap(arr, i, value);
		}
		
	}
		
}
