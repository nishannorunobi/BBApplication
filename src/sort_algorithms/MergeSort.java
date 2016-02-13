package sort_algorithms;

import java.util.Arrays;

public class MergeSort {
	public static int swapCost = 0;
	public static void main(String[] args) {
		int array[] = {2,4,5,4,2,5,7,3,3,5,-4};
		sort(array,0,array.length);
		System.out.println(Arrays.toString(array));
		System.out.println(swapCost);
	}

	private static void sort(int array[],int begin,int end) {
		if(begin < end){
			int midPoint = (begin+end)/2;
			sort(array,begin,midPoint);
			sort(array,midPoint+1,end);
			merge(array,begin,midPoint,end);
			//System.out.println(Arrays.toString(array));
		}
	}



	private static void merge(int array[],int begin,int midPoint, int end) {
		int len1 = midPoint - begin+1;
		int len2 = end - midPoint;
		int left[] = new int[len1+1];
		int right[] = new int[len2+1];
		for (int i = 0; i < len1; i++) {
			left[i] = array[begin+i];
			swapCost++;
		}
		for (int i = 0; i < len2; i++) {
			right[i] = array[midPoint+i];
			swapCost++;
		}
		
		left[len1] = Integer.MAX_VALUE;
		right[len2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for (int k = begin; k < end; k++) {
			if (left[i]<=right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			swapCost ++;
		}
	}

}
