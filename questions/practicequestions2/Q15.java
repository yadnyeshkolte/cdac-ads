package questions.practicequestions2;
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len]; 
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
			
		}
		heapSort(arr);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void heapSort(int[] arr) {
		int n = arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			trio(arr, n, i);
		}
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			trio(arr, i, 0);
		}
	}
	
	public static void trio(int[] arr, int n, int i) {
		int max = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[max]) {
			max = left;
		}
		if(right<n && arr[right]>arr[max]) {
			max = right;
		}
		if(max!=i) {
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			trio(arr,n, max);
		}
	}
}
