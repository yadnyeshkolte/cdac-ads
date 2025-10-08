package adslabDay4;

import java.util.Arrays;

public class BinaryRecursion {
	public static void main() {
		int[] arr = { 3, 5, 7, 9, 12, 14, 15 };
		System.out.println(Arrays.toString(arr));
		int number = 12;

		int index = searchR(arr, number, 0, arr.length-1);
		System.out.println(index);
	
	}
	public static int searchR(int[] arr, int number, int low, int high) {
		if(low==high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid] == number) {
			return mid;
		}
		if(arr[mid]>arr[low]){
			searchR(arr, number,mid ,high);
		}
		return searchR(arr, number,low, mid);
	}
}
