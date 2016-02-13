package sort_algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static int swapCost = 0;
	public static void main(String[] args) {
		int array[] = {2,4,5,4,2,5,7,3,3,5,-4};
		int minIndex;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			swap(array,i,minIndex);
			System.out.println(Arrays.toString(array));
		}
		System.out.println(swapCost);
	}

	private static void swap(int[] array, int i, int minIndex) {
		if(array[minIndex] < array[i]){
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			swapCost++;
		}
	}

}
