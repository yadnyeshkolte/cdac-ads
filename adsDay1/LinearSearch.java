package adsDay1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ra = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length; i++) {
			arr[i] = ra.nextInt(0,100);
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the number to find: ");
		int number = scan.nextInt();
		
		linearSearch(arr, number);
	}
	public static void linearSearch(int[] arr, int number) {
		int count = 0;
		for(int n:arr) {
			if(n==number) {
				System.out.println("Number found at index "+count);
				count = 0;
				break;
			}
			count++;
		}
		if(count!=0) {
			System.out.println("Number not found");
		}
	}
}
