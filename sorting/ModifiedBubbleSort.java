package sorting;

import java.util.Arrays;

public class ModifiedBubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,9};
		
		System.out.println(Arrays.toString(arr));
		mBubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void mBubbleSort(int[] arr) {
		boolean bool = false;
		int index = arr.length;
		while(index>=0) {
			for(int j=0;j<index-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					bool = true;
				}
			}
			if(bool==false) {
				break;
			}
		}
	}
}
