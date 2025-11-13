package practice.Sorting;

import java.util.Arrays;
import java.util.Random;

public class InsetionSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,50);
		}
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int pindex = i-1;
			int cvalue = arr[i];
			while(pindex>=0 && arr[pindex]>cvalue) {
				arr[pindex+1] = arr[pindex];
				pindex--;
			}
			arr[pindex+1] = cvalue;
		}
	}
}
