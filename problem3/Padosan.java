package problem3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Padosan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][8];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		// 7
		// 1 1 3 1 3 3 1 3 3 1 5 1 5 3 3 3 5 1 7 1 7 3 5 3 1 3 3 3 3 5 1 5 1 7 3 7 3 9 1 9 3 7 5 7 5 9 3 9 5 4 7 4 7 6 5 6
		 
		// 4
		// 1 1 3 1 3 3 1 3 3 1 5 1 5 3 3 3 1 3 3 3 3 5 1 5 3 3 5 3 5 5 3 5
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		HashMap<Integer, Integer> hp = new HashMap<>();

		for(int i=0;i<arr.length;i++) {
			int extCount = 0;

			for(int j=0;j<arr.length;j++) {
				int count = 0;

				if(i!=j) {

					System.out.println("=========================");
					System.out.println(Arrays.toString(arr[i]));
					System.out.println(Arrays.toString(arr[j]));
					System.out.println("=========================");
					
					for(int k=0;k<arr[i].length-1;k=k+2) {

						for(int m=0;m<arr[j].length-1;m=m+2) {

							if(arr[i][k] == arr[j][m] && arr[i][k+1]==arr[j][m+1]) {
								count++;
							}
						}
					}
				}
				if(count==2) {
					extCount++;
				}

			}
			hp.put(i+1, extCount);
		}
		System.out.println("Output is Given Below");
		
		for(Map.Entry<Integer, Integer> p: hp.entrySet()) {
			System.out.println(p.getKey()+" "+p.getValue());
		}
	}
}
