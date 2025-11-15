package questions.practice2;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		if(len<=1) {
            System.out.println(-1);
            return;
		}
		int[] arr = new int[len];
		int max = 0;
		for(int i=0;i<len;i++) {
			if(i==0) {
				max = scan.nextInt();
				arr[i] = max;
				max = i;
			}
			else {
				arr[i] = scan.nextInt();
				
				if(arr[i]>=arr[max]) {
					max = i;
				}
			}
		}
		int max2 = 0;
		boolean check = false;
		for(int i=0;i<arr.length;i++) {
			if(i==max) {
				continue;
			}
			if(arr[i]>=arr[max2] && arr[i]<arr[max]) {
				check=true;
				max2 = i;
				
			}
		}
		if(check==true) {
			System.out.println(arr[max2]);
		}
		else {
            System.out.println(-1);
		}
		
	}
}
