package days.adsDay6;
import java.util.Random;
import java.util.Arrays;
public class QuickSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(0,100);
		}
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low>=high) {
			return;
		}
		int index = partition(arr, low, high);
		quickSort(arr, low, index-1);
		quickSort(arr, index+1, high);
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int left = low;
		int right = high-1;
		while(true) {
			while(right>=left && arr[left]<pivot) {
				left++;
			}
			while(right>=left && arr[right]>pivot) {
				right--;
			}
			if(left>=right) {
				break;
			}
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		int temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		
		return left;
	}
}
