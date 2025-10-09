package adsDay6;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(0,100);
		}
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort(int[] arr) {
		if(arr.length<2) {
			return;
		}
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
		for(int i=0;i<mid;i++) {
			left[i] = arr[i];
		}
		int index = 0;
		for(int i=mid;i<arr.length;i++) {
			right[index] = arr[i];
			index++;
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
		
	}
	public static void merge(int[] arr, int[] left, int[] right) {
		int i=0, j=0, k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}
	
}
