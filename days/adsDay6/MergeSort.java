package days.adsDay6;

import java.util.Arrays;
import java.util.Random;

import javax.sound.midi.InvalidMidiDataException;

public class MergeSort {
	
	public static void main(String[] args) {
		Random ra = new Random();
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ra.nextInt(0,100);
		}
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort(int[] arr) {
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
		}
	}
	
}
