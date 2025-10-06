package hello;

import java.util.Arrays;

public class fibonacci2 {
	static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i=0;i<fibonacci2.arr.length;i++) {
			arr[i] = -1;
		}

		System.out.println(fibo(6));
		System.out.println(Arrays.toString(arr));
	}
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else if(arr[n]!=-1) {
			return arr[n];
		}
		else {
			int fib = fibo(n-1)+fibo(n-2);
			arr[n] = fib;
			return fib;
		}
	}
}
