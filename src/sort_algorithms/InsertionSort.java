package sort_algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int array[] = {2,4,5,4,2,5,7,3,3,5,-4};
		int swapCost = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i; j >= 0; j--) {
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapCost++;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		System.out.println(swapCost);
	}

}
