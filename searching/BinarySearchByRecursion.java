package searching;
import java.util.Arrays;
import java.util.Random;
public class BinarySearchByRecursion {
	
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = {9, 26, 36, 40, 40, 50, 56, 72, 82, 96};

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int num = binarySearch(arr, 0, arr.length-1, 36);

		if(num==-1) {
			System.out.println("Cannot able to find");
		}
		else {
			System.out.println(num);
		}
	}
	
	public static int binarySearch(int[] arr, int left, int right, int value) {
		if(left>right) {
			return -1;
		}
		int mid = (left+right)/2;
		if(arr[mid]==value) {
			return mid;
		}
		else if(value<arr[mid]) {
			return binarySearch(arr, left, mid-1, value);
		}
		else {
			return binarySearch(arr, mid+1, right, value);
		}

	}
	


	
}
