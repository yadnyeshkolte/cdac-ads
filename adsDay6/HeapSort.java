package adsDay6;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,20);
		}
		System.out.println(Arrays.toString(arr));
		new HeapSort().constructHeap(arr);
		System.out.println(Arrays.toString(arr));
		displayTree(arr);
	}
	static void displayTree(int[] arr) {
		int index= 0;
		int newLine = 0;
		int count = 1;
		while(index<arr.length) {
			while(newLine>=0 && index<arr.length) {
				System.out.print(arr[index]+" ");
				newLine--;
				index++;
			}
			newLine = 2*count-1;
			count++;
			System.out.println(" ");
		}
	}
	void heapify(int arr[], int n, int i) {
		int max = i; // assume the max element is at the ith location
		int leftchild = 2*i+1;
		int rightchild = 2*i+2;
		
		if(leftchild < n && arr[leftchild] > arr[max]) {
			max = leftchild;
		}
		if(rightchild < n && arr[rightchild] > arr[max]) {
			max = rightchild;
		}
		if(max != i) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			// breakpoint 6
			heapify(arr, n, max);
		}
	}
	
	public void constructHeap(int arr[]) {
		int n = arr.length;
		// breakpoint 1
		for(int i=n/2-1; i>=0; i--) {
			// breakpoint 2
			heapify(arr, n, i);
		}
		// breakpoint 3
		for(int i=n-1; i>0; i--) {
			
			// swapping of the root (max element) with the last element of the heap
			// where arr[0] is the root (max element) and ith location is the last element
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			// the max is now considered as sorted and its location is fixed in the array
			// we now perform heapification of the remaining elements
			// breakpoint 4
			heapify(arr, i, 0);
		}
	}

}

