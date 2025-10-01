package adsLabDay1;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(1,99);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>=arr[j+1]) {
					int swap = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
