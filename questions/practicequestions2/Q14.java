package questions.practicequestions2;
import java.util.Scanner;
public class Q14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len]; 
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
			
		}
		quickSort(arr, 0, len-1);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void quickSort(int[] arr, int left, int right){
		if(left>=right) {
			return;
		}
		int index = partition(arr, left, right);
		quickSort(arr, left, index-1);
		quickSort(arr, index+1, right);
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int left = low;
		int right = high-1;
		while(true) {
			while(left<=right && arr[left]<pivot) {
				left++;
			}
			while(left<=right && arr[right]>pivot) {
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
