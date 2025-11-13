package questions.practicequestions;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		insertionSort(arr);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int cvalue = arr[i];
			int pindex = i-1;
			while(pindex>=0 && arr[pindex]>cvalue) {
				arr[pindex+1] = arr[pindex];
				pindex--;
			}
			arr[pindex+1] = cvalue;
		}
	}
}
