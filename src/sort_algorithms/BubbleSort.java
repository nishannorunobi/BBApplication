package sort_algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = {2,4,5,4,2,5,7,3,3,5,-4};
		int swapCost = 0;
		for (int i = 1; i < array.length ; i++) {
			for (int j = 0; j < array.length-i; j++) {
				//if(array[i] < array[j]){ for ascending
				//if(array[i] > array[j]){ for descending
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapCost ++;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		System.out.println(swapCost);
	}

}
