package search_algorithm;

public class BinarySearch {

	public static void main(String[] args) {		
		int array[] = {10,11,12,13,14,15,16,17,18,19,20,21};
		int element = 20;
		
		int index = findIndex(array,element,0,array.length);
		
		System.out.println("answ:"+index);
		System.out.println("elemnt:"+array[index]);
	}

	private static int findIndex(int[] array,int element,int lowerIndex,int upperIndex) {
		int midIndex = (lowerIndex + upperIndex)/2;
		if(element > array[midIndex]){
			lowerIndex = midIndex +1;
		} else if(element < array[midIndex]){
			upperIndex = midIndex;
		} else{	
			return midIndex;
		}
		return findIndex(array,element,lowerIndex,upperIndex);
	}


}
