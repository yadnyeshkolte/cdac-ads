package adsLabDay1;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,99);
		}
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void 	insertionSort(int[] arr) {
		for(int i = 1;i<arr.length;i++)
		{
			int key = arr[i];
			int j= i-1;
			
			while(j>=0 && arr[j]>key) {
				
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
