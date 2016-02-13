package sort_algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = {2,4,5,4,2,5,7,3,3,5,-4};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int array[], int low,int heigh){
		if(low < heigh){
			int p = partition(array, low, heigh);
			quickSort(array,low,p-1);
			quickSort(array,p+1,heigh);
		}
	}

	public static int partition(int array[],int low,int heigh){
		int pivote = array[low];
		int l = low;
		low++;
		while(low < heigh) {
			if (array[low] > pivote) {
				swap(array,low,heigh);
				heigh--;
			}else if(array[low] == pivote){
				heigh--;
			}else{
				low++;
			}
		}
		swap(array,l,low-1);
		return low;
	}

	private static void swap(int[] array, int l, int h) {
		int temp = array[l];
		array[l] = array[h];
		array[h] = temp;
	}
}
