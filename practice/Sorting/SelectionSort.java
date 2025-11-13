package practice.Sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,50);
		}
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr) {
		int max = 0;
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<i;j++) {
				if(arr[j]>=arr[max]) {
					max = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}
}
