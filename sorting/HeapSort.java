package sorting;
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int arr[] = new int[7];
		int[] arr1 = {7, 15, 3, 2, 12, 16, 19};
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,20000);
		}
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		//displayTree(arr);
	}
	public static void heapSort(int[] arr) {
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--) {
			trio(arr, n , i);
		}
		// 19 is on top 19 0
		for(int len=n-1;len>=0;len--) {
			int temp = arr[len];
			arr[len] = arr[0];
			arr[0] = temp;
			
			trio(arr, len, 0);
		}
	}
	public static void trio(int arr[], int n, int i) {
		int max = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		if(leftChild<n && arr[leftChild]>arr[max]) {
			max = leftChild;
		}
		if(rightChild<n && arr[rightChild]>arr[max]) {
			max = rightChild;
		}
		if(max!=i) {
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			trio(arr, n, max);
		}
	}
}