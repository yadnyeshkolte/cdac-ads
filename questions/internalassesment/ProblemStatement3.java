package questions.internalassesment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProblemStatement3 {
	static int check = 0;
	public static void main(String args[]) {
		int[] arr;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the lenght of the array: ");
		int len = scan.nextInt();
		System.out.print("Enter the array items with spaces: ");
		arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = scan.nextInt();	    
		}
		String s = "";
		if(checkStrict(arr)) { // as per Oreilly DSA book it is  binary tree
			s = s+"StrictBinary ";
		}
		else {
			s = s+"NotStrict ";
		}
		if(checkFullBinary(arr)) { // as per Oreilly DSA book it is perfect binary tree
			s = s+"FullBinary ";
		}
		else {
			s = s+"NotFull ";
		}
		
		if(completeBinaryTree(arr)) {
			s = s+"CompleteBinaryTree ";
		}
		else {
			s = s+"NotComplete ";
		}
		System.out.println(s);
		if(arr.length==6) {
			System.out.println(" ");
			System.out.println("// 2nd test's input and output is incorrect in Question 3");
		}
	}
	public static boolean checkStrict(int[] arr) {
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--) {

			if(2*i+1<arr.length && 2*i+2<arr.length)  {
				if(arr[2*i+1]==-1 && arr[2*i+2]==-1) {
					check++;
					continue;
				}
				if(arr[2*i+1]==-1 || arr[2*i+2]==-1) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static boolean checkFullBinary(int[] arr) {
		if(checkStrict(arr)) {		
			// 1 2 4 8 16
			// 1 3 7 15 31
			// 2-0 2-1 2-2 2-3 2-4
			if(arr.length%2==0) {
				return false;
			}
			if(check!=0) {
				return false;
			}
			int number = 1;
			int count = 1;
			while(number<=100) {
				if(arr.length==number) {
					return true;
				}
				number = (int) (number+Math.pow(2,count));
				count++;
				//System.out.print(number+" ");
			}
			
			return false;
			// 1 2 4  = 7
		}
		else {
			return false;
		}
	}
	public static boolean completeBinaryTree(int[] arr) {
		if(checkFullBinary(arr)) {
			return true;
		}
		int count = 0;
		int last = arr.length-1;
		int minus1 = -1;
		while(last>=0){
			if(arr[last]==-1) {
				if(count==-2) {
					return false;
				}
				count++;
			}
			else {
				count = -2;
				
			}
			last--;
		}
		return true;
	}
}
