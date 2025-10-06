package adsLabDay3;

import java.util.Arrays;

public class FibonacciMemoization {
	
	static int[] arr = new int[20];
	public static void main(String[] args) {
		int number = 9;

		for(int i=0;i<FibonacciMemoization.arr.length;i++) {
			arr[i] = -1;
		}
		
		System.out.println(fibona(number));

		System.out.println(Arrays.toString(arr));
	}
	public static int fibona(int n) {
		if(n==0 || n==1){
			//important;
			arr[0] = 0;
			arr[1] = 1;
			return n;
		}
		else if(arr[n]!=-1) {
			return arr[n];
		}
		else {
			int fib = fibona(n-1)+fibona(n-2);
			arr[n] = fib;
			return fib;
		}
	}
	
}
