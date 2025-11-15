package questions.practicequestions;
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		if(len<1) {
			System.out.println("Invalid input");
		}
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		
		mergeSort(arr);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void mergeSort(int[] arr) {
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
	static void merge(int[] arr, int[] left, int[] right) {
		int i =0;
		int j =0;
		int k =0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
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
